-- Passo 7

-- Triggers de proteção para impedir duplicados nos inserts e update

DELIMITER //
CREATE TRIGGER trg_prevenir_cat_receita_insert_duplicado
BEFORE INSERT ON tb_cat_receita
FOR EACH ROW
BEGIN
    IF EXISTS (SELECT 1 FROM tb_cat_receita WHERE CATEGORIA_RECEITA = NEW.CATEGORIA_RECEITA AND SUB_CATEGORIA = NEW.SUB_CATEGORIA) THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Não é permitido inserir registros duplicados na tabela tb_cat_receita.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER trg_prevenir_cat_receita_update_duplicado
BEFORE UPDATE ON tb_cat_receita
FOR EACH ROW
BEGIN
    IF EXISTS (SELECT 1 FROM tb_cat_receita WHERE  CATEGORIA_RECEITA = NEW.CATEGORIA_RECEITA AND SUB_CATEGORIA = NEW.SUB_CATEGORIA) THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Não é permitido atualizar para registros duplicados na tabela tb_cat_receita.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER trg_prevenir_cat_despesa_insert_duplicado
BEFORE INSERT ON tb_cat_despesa
FOR EACH ROW
BEGIN
    IF EXISTS (SELECT 1 FROM tb_cat_despesa WHERE CATEGORIA_DESPESA = NEW.CATEGORIA_DESPESA AND SUB_CATEGORIA_DESPESA = NEW.SUB_CATEGORIA_DESPESA) THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Não é permitido inserir registros duplicados na tabela tb_cat_despesa.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER trg_prevenir_cat_despesa_update_duplicado
BEFORE UPDATE ON tb_cat_despesa
FOR EACH ROW
BEGIN
    IF EXISTS (SELECT 1 FROM tb_cat_despesa WHERE CATEGORIA_DESPESA = NEW.CATEGORIA_DESPESA AND SUB_CATEGORIA_DESPESA = NEW.SUB_CATEGORIA_DESPESA) THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Não é permitido atualizar para registros duplicados na tabela tb_cat_despesa.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER trg_prevenir_cartao_credito_insert_duplicado
BEFORE INSERT ON TB_CARTAO_CREDITO
FOR EACH ROW
BEGIN
    IF EXISTS (SELECT 1 FROM TB_CARTAO_CREDITO WHERE ID_CC_BANCO_FK = NEW.ID_CC_BANCO_FK AND NOME_CARTAO_CREDITO = NEW.NOME_CARTAO_CREDITO) THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Não é permitido inserir registros duplicados na coluna ID_CC_BANCO_FK e NOME_CARTAO_CREDITO da tabela TB_CARTAO_CREDITO.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER trg_prevenir_cartao_credito_update_duplicado
BEFORE UPDATE ON TB_CARTAO_CREDITO
FOR EACH ROW
BEGIN
    IF EXISTS (SELECT 1 FROM TB_CARTAO_CREDITO WHERE ID_CC_BANCO_FK = NEW.ID_CC_BANCO_FK AND NOME_CARTAO_CREDITO = NEW.NOME_CARTAO_CREDITO) THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Não é permitido atualizar registros duplicados na coluna ID_CC_BANCO_FK e NOME_CARTAO_CREDITO da tabela TB_CARTAO_CREDITO.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_insert_tb_moeda
BEFORE INSERT ON TB_MOEDA
FOR EACH ROW
BEGIN
    DECLARE count_rows INT;

    SELECT COUNT(*) INTO count_rows
    FROM TB_PAIS
    WHERE ID_PAIS = NEW.ID_MOEDA_PAIS_FK;

    IF count_rows = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_MOEDA_PAIS_FK não é válido na tabela TB_PAIS.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_update_tb_moeda
BEFORE UPDATE ON TB_MOEDA
FOR EACH ROW
BEGIN
    DECLARE count_rows INT;

    SELECT COUNT(*) INTO count_rows
    FROM TB_PAIS
    WHERE ID_PAIS = NEW.ID_MOEDA_PAIS_FK;

    IF count_rows = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_MOEDA_PAIS_FK não é válido na tabela TB_PAIS.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_insert_tb_conta
BEFORE INSERT ON TB_CONTA
FOR EACH ROW
BEGIN
    DECLARE count_banco INT;
    DECLARE count_moeda INT;
    DECLARE count_usuario INT;

    SELECT COUNT(*) INTO count_banco
    FROM TB_BANCO
    WHERE ID_BANCO = NEW.ID_CONTA_BANCO_FK;

    SELECT COUNT(*) INTO count_moeda
    FROM TB_MOEDA
    WHERE ID_MOEDA = NEW.ID_CONTA_MOEDA_FK;

    SELECT COUNT(*) INTO count_usuario
    FROM TB_USUARIO
    WHERE ID_USUARIO = NEW.ID_CONTA_USUARIO_FK;

    IF count_banco = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_CONTA_BANCO_FK não é válido na tabela TB_BANCO.';
    END IF;

    IF count_moeda = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_CONTA_MOEDA_FK não é válido na tabela TB_MOEDA.';
    END IF;

    IF count_usuario = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_CONTA_USUARIO_FK não é válido na tabela TB_USUARIO.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_update_tb_conta
BEFORE UPDATE ON TB_CONTA
FOR EACH ROW
BEGIN
    DECLARE count_banco INT;
    DECLARE count_moeda INT;
    DECLARE count_usuario INT;

    SELECT COUNT(*) INTO count_banco
    FROM TB_BANCO
    WHERE ID_BANCO = NEW.ID_CONTA_BANCO_FK;

    SELECT COUNT(*) INTO count_moeda
    FROM TB_MOEDA
    WHERE ID_MOEDA = NEW.ID_CONTA_MOEDA_FK;

    SELECT COUNT(*) INTO count_usuario
    FROM TB_USUARIO
    WHERE ID_USUARIO = NEW.ID_CONTA_USUARIO_FK;

    IF count_banco = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_CONTA_BANCO_FK não é válido na tabela TB_BANCO.';
    END IF;

    IF count_moeda = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_CONTA_MOEDA_FK não é válido na tabela TB_MOEDA.';
    END IF;

    IF count_usuario = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_CONTA_USUARIO_FK não é válido na tabela TB_USUARIO.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_insert_tb_lancamento
BEFORE INSERT ON TB_LANCAMENTO
FOR EACH ROW
BEGIN
    DECLARE count_conta INT;

    SELECT COUNT(*) INTO count_conta
    FROM TB_CONTA
    WHERE ID_CONTA = NEW.ID_LANC_CONTA_FK;

    IF count_conta = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_LANCAMENTO_CONTA_FK não é válido na tabela TB_CONTA.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_update_tb_lancamento
BEFORE UPDATE ON TB_LANCAMENTO
FOR EACH ROW
BEGIN
    DECLARE count_conta INT;

    SELECT COUNT(*) INTO count_conta
    FROM TB_CONTA
    WHERE ID_CONTA = NEW.ID_LANC_CONTA_FK;

    IF count_conta = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_LANCAMENTO_CONTA_FK não é válido na tabela TB_CONTA.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_insert_tb_aporte_plan
BEFORE INSERT ON TB_APORTE_PLAN
FOR EACH ROW
BEGIN
    DECLARE count_lancamento INT;
    DECLARE count_planejamento INT;

    SELECT COUNT(*) INTO count_lancamento
    FROM TB_LANCAMENTO
    WHERE ID_LANCAMENTO = NEW.ID_APOR_LANC_FK;

    SELECT COUNT(*) INTO count_planejamento
    FROM TB_PLANEJAMENTO
    WHERE ID_PLANEJAMENTO = NEW.ID_APOR_PLAN_FK;

    IF count_lancamento = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_APOR_LANC_FK não é válido na tabela TB_LANCAMENTO.';
    END IF;

    IF count_planejamento = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_APOR_PLAN_FK não é válido na tabela TB_PLANEJAMENTO.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_update_tb_aporte_plan
BEFORE UPDATE ON TB_APORTE_PLAN
FOR EACH ROW
BEGIN
    DECLARE count_lancamento INT;
    DECLARE count_planejamento INT;

    SELECT COUNT(*) INTO count_lancamento
    FROM TB_LANCAMENTO
    WHERE ID_LANCAMENTO = NEW.ID_APOR_LANC_FK;

    SELECT COUNT(*) INTO count_planejamento
    FROM TB_PLANEJAMENTO
    WHERE ID_PLANEJAMENTO = NEW.ID_APOR_PLAN_FK;

    IF count_lancamento = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_APOR_LANC_FK não é válido na tabela TB_LANCAMENTO.';
    END IF;

    IF count_planejamento = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_APOR_PLAN_FK não é válido na tabela TB_PLANEJAMENTO.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_insert_tb_transferencia
BEFORE INSERT ON TB_TRANSFERENCIA
FOR EACH ROW
BEGIN
    DECLARE count_lancamento INT;
    DECLARE count_conta INT;

    SELECT COUNT(*) INTO count_lancamento
    FROM TB_LANCAMENTO
    WHERE ID_LANCAMENTO = NEW.ID_LANC_DESTINO_FK;

    SELECT COUNT(*) INTO count_conta
    FROM TB_CONTA
    WHERE ID_CONTA = NEW.ID_CONTA_DESTINO_FK;

    IF count_lancamento = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_LANC_DESTINO_FK não é válido na tabela TB_LANCAMENTO.';
    END IF;

    IF count_conta = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_CONTA_DESTINO_FK não é válido na tabela TB_CONTA.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_update_tb_transferencia
BEFORE UPDATE ON TB_TRANSFERENCIA
FOR EACH ROW
BEGIN
    DECLARE count_lancamento INT;
    DECLARE count_conta INT;

    SELECT COUNT(*) INTO count_lancamento
    FROM TB_LANCAMENTO
    WHERE ID_LANCAMENTO = NEW.ID_LANC_DESTINO_FK;

    SELECT COUNT(*) INTO count_conta
    FROM TB_CONTA
    WHERE ID_CONTA = NEW.ID_CONTA_DESTINO_FK;

    IF count_lancamento = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_LANC_DESTINO_FK não é válido na tabela TB_LANCAMENTO.';
    END IF;

    IF count_conta = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_CONTA_DESTINO_FK não é válido na tabela TB_CONTA.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_insert_tb_receita
BEFORE INSERT ON TB_RECEITA
FOR EACH ROW
BEGIN
    DECLARE count_lancamento INT;
    DECLARE count_cat_receita INT;

    SELECT COUNT(*) INTO count_lancamento
    FROM TB_LANCAMENTO
    WHERE ID_LANCAMENTO = NEW.ID_REC_LANC_FK;

    SELECT COUNT(*) INTO count_cat_receita
    FROM TB_CAT_RECEITA
    WHERE ID_CAT_RECEITA = NEW.ID_REC_CAT_RECEITA_FK;

    IF count_lancamento = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_REC_LANC_FK não é válido na tabela TB_LANCAMENTO.';
    END IF;

    IF count_cat_receita = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_REC_CAT_RECEITA_FK não é válido na tabela TB_CAT_RECEITA.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_update_tb_receita
BEFORE UPDATE ON TB_RECEITA
FOR EACH ROW
BEGIN
    DECLARE count_lancamento INT;
    DECLARE count_cat_receita INT;

    SELECT COUNT(*) INTO count_lancamento
    FROM TB_LANCAMENTO
    WHERE ID_LANCAMENTO = NEW.ID_REC_LANC_FK;

    SELECT COUNT(*) INTO count_cat_receita
    FROM TB_CAT_RECEITA
    WHERE ID_CAT_RECEITA = NEW.ID_REC_CAT_RECEITA_FK;

    IF count_lancamento = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_REC_LANC_FK não é válido na tabela TB_LANCAMENTO.';
    END IF;

    IF count_cat_receita = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_REC_CAT_RECEITA_FK não é válido na tabela TB_CAT_RECEITA.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_insert_tb_despesa
BEFORE INSERT ON TB_DESPESA
FOR EACH ROW
BEGIN
    DECLARE count_lancamento INT;
    DECLARE count_cat_despesa INT;

    SELECT COUNT(*) INTO count_lancamento
    FROM TB_LANCAMENTO
    WHERE ID_LANCAMENTO = NEW.ID_DESP_LANC_FK;

    SELECT COUNT(*) INTO count_cat_despesa
    FROM TB_CAT_DESPESA
    WHERE ID_CAT_DESPESA = NEW.ID_CAT_DESPESA_FK;

    IF count_lancamento = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_DESP_LANC_FK não é válido na tabela TB_LANCAMENTO.';
    END IF;

    IF count_cat_despesa = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_CAT_DESPESA_FK não é válido na tabela TB_CAT_DESPESA.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_update_tb_despesa
BEFORE UPDATE ON TB_DESPESA
FOR EACH ROW
BEGIN
    DECLARE count_lancamento INT;
    DECLARE count_cat_despesa INT;

    SELECT COUNT(*) INTO count_lancamento
    FROM TB_LANCAMENTO
    WHERE ID_LANCAMENTO = NEW.ID_DESP_LANC_FK;

    SELECT COUNT(*) INTO count_cat_despesa
    FROM TB_CAT_DESPESA
    WHERE ID_CAT_DESPESA = NEW.ID_CAT_DESPESA_FK;

    IF count_lancamento = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_DESP_LANC_FK não é válido na tabela TB_LANCAMENTO.';
    END IF;

    IF count_cat_despesa = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_CAT_DESPESA_FK não é válido na tabela TB_CAT_DESPESA.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_insert_tb_cartao_credito
BEFORE INSERT ON TB_CARTAO_CREDITO
FOR EACH ROW
BEGIN
    DECLARE count_banco INT;

    SELECT COUNT(*) INTO count_banco
    FROM TB_BANCO
    WHERE ID_BANCO = NEW.ID_CC_BANCO_FK;

    IF count_banco = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_CC_BANCO_FK não é válido na tabela TB_BANCO.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_update_tb_cartao_credito
BEFORE UPDATE ON TB_CARTAO_CREDITO
FOR EACH ROW
BEGIN
    DECLARE count_banco INT;

    SELECT COUNT(*) INTO count_banco
    FROM TB_BANCO
    WHERE ID_BANCO = NEW.ID_CC_BANCO_FK;

    IF count_banco = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_CC_BANCO_FK não é válido na tabela TB_BANCO.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_insert_tb_lanc_cartao_credito
BEFORE INSERT ON TB_LANC_CARTAO_CREDITO
FOR EACH ROW
BEGIN
    DECLARE count_lancamento INT;
    DECLARE count_cartao_credito INT;

    SELECT COUNT(*) INTO count_lancamento
    FROM TB_LANCAMENTO
    WHERE ID_LANCAMENTO = NEW.ID_LC_LANC_FK;

    SELECT COUNT(*) INTO count_cartao_credito
    FROM TB_CARTAO_CREDITO
    WHERE ID_CARTAO_CREDITO = NEW.ID_LC_CARTAO_CREDITO_FK;

    IF count_lancamento = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_LC_LANC_FK não é válido na tabela TB_LANCAMENTO.';
    END IF;

    IF count_cartao_credito = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_LC_CARTAO_CREDITO_FK não é válido na tabela TB_CARTAO_CREDITO.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_update_tb_lanc_cartao_credito
BEFORE UPDATE ON TB_LANC_CARTAO_CREDITO
FOR EACH ROW
BEGIN
    DECLARE count_lancamento INT;
    DECLARE count_cartao_credito INT;

    SELECT COUNT(*) INTO count_lancamento
    FROM TB_LANCAMENTO
    WHERE ID_LANCAMENTO = NEW.ID_LC_LANC_FK;

    SELECT COUNT(*) INTO count_cartao_credito
    FROM TB_CARTAO_CREDITO
    WHERE ID_CARTAO_CREDITO = NEW.ID_LC_CARTAO_CREDITO_FK;

    IF count_lancamento = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_LC_LANC_FK não é válido na tabela TB_LANCAMENTO.';
    END IF;

    IF count_cartao_credito = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_LC_CARTAO_CREDITO_FK não é válido na tabela TB_CARTAO_CREDITO.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_insert_tb_fatura
BEFORE INSERT ON TB_FATURA
FOR EACH ROW
BEGIN
    DECLARE count_lanc_cartao_credito INT;

    SELECT COUNT(*) INTO count_lanc_cartao_credito
    FROM TB_LANC_CARTAO_CREDITO
    WHERE ID_LC_CRED = NEW.ID_FT_LC_CRED_FK;

    IF count_lanc_cartao_credito = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_FT_LC_CRED_FK não é válido na tabela TB_LANC_CARTAO_CREDITO.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_update_tb_fatura
BEFORE UPDATE ON TB_FATURA
FOR EACH ROW
BEGIN
    DECLARE count_lanc_cartao_credito INT;

    SELECT COUNT(*) INTO count_lanc_cartao_credito
    FROM TB_LANC_CARTAO_CREDITO
    WHERE ID_LC_CRED = NEW.ID_FT_LC_CRED_FK;

    IF count_lanc_cartao_credito = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_FT_LC_CRED_FK não é válido na tabela TB_LANC_CARTAO_CREDITO.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_insert_tb_limites_gastos
BEFORE INSERT ON TB_LIMITES_GASTOS
FOR EACH ROW
BEGIN
    DECLARE count_conta INT;
    DECLARE count_cat_despesa INT;

    SELECT COUNT(*) INTO count_conta
    FROM TB_CONTA
    WHERE ID_CONTA = NEW.ID_LG_CONTA_FK;

    SELECT COUNT(*) INTO count_cat_despesa
    FROM TB_CAT_DESPESA
    WHERE ID_CAT_DESPESA = NEW.ID_LG_CAT_DESPESA_FK;

    IF count_conta = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_LG_CONTA_FK não é válido na tabela TB_CONTA.';
    END IF;

    IF count_cat_despesa = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_LG_CAT_DESPESA_FK não é válido na tabela TB_CAT_DESPESA.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER before_update_tb_limites_gastos
BEFORE UPDATE ON TB_LIMITES_GASTOS
FOR EACH ROW
BEGIN
    DECLARE count_conta INT;
    DECLARE count_cat_despesa INT;

    SELECT COUNT(*) INTO count_conta
    FROM TB_CONTA
    WHERE ID_CONTA = NEW.ID_LG_CONTA_FK;

    SELECT COUNT(*) INTO count_cat_despesa
    FROM TB_CAT_DESPESA
    WHERE ID_CAT_DESPESA = NEW.ID_LG_CAT_DESPESA_FK;

    IF count_conta = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_LG_CONTA_FK não é válido na tabela TB_CONTA.';
    END IF;

    IF count_cat_despesa = 0 THEN
        SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = 'O valor de ID_LG_CAT_DESPESA_FK não é válido na tabela TB_CAT_DESPESA.';
    END IF;
END //
DELIMITER ;
