-- Passo 5

-- Primeira regra

DELIMITER //
CREATE TRIGGER trigger_verificar_limite_despesa
AFTER INSERT ON tb_despesa
FOR EACH ROW
BEGIN
  -- Obtém a data atual
  DECLARE data_atual DATE;
  -- Obtém o ano e mês atual
  DECLARE ano_atual INT;
  DECLARE mes_atual INT;
  -- Variáveis para armazenar a soma das despesas e o limite mensal
  DECLARE soma_despesas DECIMAL(10,2);
  DECLARE limite_mensal DECIMAL(10,2);
  -- Calcula o valor acima da despesa
  DECLARE valor_acima_despesa DECIMAL(10, 2);
  DECLARE conta_id INT;
  
  SET data_atual = CURDATE();
  SET ano_atual = YEAR(data_atual);
  SET mes_atual = MONTH(data_atual);
  
  -- Soma os valores dos lançamentos feitos no ano e mês correntes
  SELECT SUM(ld.VALOR_LANCAMENTO) INTO soma_despesas
  FROM tb_despesa d
  INNER JOIN tb_lancamento ld ON d.ID_DESP_LANC_FK = ld.ID_LANCAMENTO
  WHERE YEAR(ld.DATA_LANCAMENTO) = ano_atual
    AND MONTH(ld.DATA_LANCAMENTO) = mes_atual;
  
  -- Obtém o limite mensal e o ID da conta para a categoria de despesa
  SELECT LIMITE_MENSAL, ID_LG_CONTA_FK
  INTO limite_mensal, conta_id
  FROM TB_LIMITES_GASTOS
  WHERE ID_LG_CAT_DESPESA_FK = NEW.ID_CAT_DESPESA_FK;
  
  -- Verifica se a soma das despesas ultrapassa o limite
  IF soma_despesas > limite_mensal THEN
    SET valor_acima_despesa = soma_despesas - limite_mensal;
    -- Insere os valores na tabela TB_LOG
    INSERT INTO TB_LOG (ID_LOG_CONTA_FK, VALOR_ACIMA_DESPESA, DATA_LOG)
    VALUES (conta_id, valor_acima_despesa, data_atual);
  END IF;
END //
DELIMITER ;
