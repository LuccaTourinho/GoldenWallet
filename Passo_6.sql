-- Passo 6

-- Crie a procedure para chamar o log

DELIMITER //
CREATE PROCEDURE consultar_valor_ultrapassado(
  IN nome_conta VARCHAR(50),
  IN ano INT,
  IN mes INT
)
BEGIN
  -- Variável para armazenar o valor máximo ultrapassado
  DECLARE valor_ultrapassado DECIMAL(10, 2);

  -- Obtém o maior valor_acima_despesa para a conta, ano e mês informados
  SELECT IFNULL(MAX(VALOR_ACIMA_DESPESA),0) INTO valor_ultrapassado
  FROM TB_LOG
  INNER JOIN TB_CONTA ON TB_LOG.ID_LOG_CONTA_FK = TB_CONTA.ID_CONTA
  WHERE TB_CONTA.NOME_CONTA = nome_conta
    AND YEAR(TB_LOG.DATA_LOG) = ano
    AND MONTH(TB_LOG.DATA_LOG) = mes;
  
  -- Realiza o select com os dados desejados
  SELECT TB_CONTA.NOME_CONTA AS CONTA,
         DATE_FORMAT(TB_LOG.DATA_LOG, '%Y-%m') AS DATA_DESPESA,
         VALOR_ACIMA_DESPESA AS VALOR_ACIMA_LIMITE
  FROM TB_LOG
  INNER JOIN TB_CONTA ON TB_LOG.ID_LOG_CONTA_FK = TB_CONTA.ID_CONTA
  WHERE TB_CONTA.NOME_CONTA = nome_conta
    AND YEAR(TB_LOG.DATA_LOG) = ano
    AND MONTH(TB_LOG.DATA_LOG) = mes
    AND VALOR_ACIMA_DESPESA = valor_ultrapassado;
END //
DELIMITER ;
