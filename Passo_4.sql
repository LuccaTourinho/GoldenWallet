-- Passo 4

-- Criação dos procedures de insert

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertUsuario;
DELIMITER //
CREATE PROCEDURE InsertUsuario(
  IN nome_usuario VARCHAR(60),
  IN senha VARCHAR(15)
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_USUARIO (NOME_USUARIO, SENHA)
    VALUES (nome_usuario, senha);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertPais;
DELIMITER //
CREATE PROCEDURE InsertPais(
  IN nome_pais VARCHAR(40),
  IN sigla VARCHAR(5)
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_PAIS (NOME_PAIS, SIGLA)
    VALUES (nome_pais, sigla);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertMoeda;
DELIMITER //
CREATE PROCEDURE InsertMoeda(
  IN id_pais INT,
  IN sigla VARCHAR(5),
  IN simbolo VARCHAR(5)
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_MOEDA (ID_MOEDA_PAIS_FK, SIGLA, SIMBOLO)
    VALUES (id_pais, sigla, simbolo);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertBanco;
DELIMITER //
CREATE PROCEDURE InsertBanco(
  IN nome_banco VARCHAR(50),
  IN codigo_banco VARCHAR(10),
  IN sigla_banco VARCHAR(5)
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_BANCO (NOME_BANCO, CODIGO_BANCO, SIGLA_BANCO)
    VALUES (nome_banco, codigo_banco, sigla_banco);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertConta;
DELIMITER //
CREATE PROCEDURE InsertConta(
  IN nome_conta VARCHAR(50),
  IN valor_inicial DECIMAL(10,2),
  IN id_banco INT,
  IN id_moeda INT,
  IN id_usuario INT
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_CONTA (NOME_CONTA, VALOR_INICIAL_CONTA, ID_CONTA_BANCO_FK, ID_CONTA_MOEDA_FK, ID_CONTA_USUARIO_FK)
    VALUES (nome_conta, valor_inicial, id_banco, id_moeda, id_usuario);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertLancamento;
DELIMITER //
CREATE PROCEDURE InsertLancamento(
  IN valor_lancamento DECIMAL(10,2),
  IN data_lancamento DATE,
  IN descricao_lancamento TEXT,
  IN status_lancamento BOOLEAN,
  IN anexo_lancamento BLOB,
  IN id_conta INT
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_LANCAMENTO (VALOR_LANCAMENTO, DATA_LANCAMENTO, DESCRICAO_LANCAMENTO, STATUS_LANCAMENTO, ANEXO_LANCAMENTO, ID_LANC_CONTA_FK)
    VALUES (valor_lancamento, data_lancamento, descricao_lancamento, status_lancamento, anexo_lancamento, id_conta);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertPlanejamento;
DELIMITER //
CREATE PROCEDURE InsertPlanejamento(
  IN nome_planejamento VARCHAR(50),
  IN valor_total_planejamento DECIMAL(10,2),
  IN data_inicio_planejamento DATE,
  IN data_termino_planejamento DATE,
  IN valor_inicial_planejamento DECIMAL(10,2)
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_PLANEJAMENTO (NOME_PLANEJAMENTO, VALOR_TOTAL_PLANEJAMENTO, DATA_INICIO_PLANEJAMENTO, DATE_TERMINO_PLANEJAMENTO, VALOR_INICIAL_PLANEJAMENTO)
    VALUES (nome_planejamento, valor_total_planejamento, data_inicio_planejamento, data_termino_planejamento, valor_inicial_planejamento);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertAportePlanejamento;
DELIMITER //
CREATE PROCEDURE InsertAportePlanejamento(
  IN id_aporte_lanc_fk INT,
  IN id_aporte_plan_fk INT
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_APORTE_PLAN (ID_APOR_LANC_FK, ID_APOR_PLAN_FK)
    VALUES (id_aporte_lanc_fk, id_aporte_plan_fk);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertTransferencia;
DELIMITER //
CREATE PROCEDURE InsertTransferencia(
  IN id_lanc_destino_fk INT,
  IN id_conta_destino_fk INT
)
BEGIN
	-- Insere os dados na tabela
    INSERT INTO TB_TRANSFERENCIA (ID_LANC_DESTINO_FK, ID_CONTA_DESTINO_FK)
    VALUES (id_lanc_destino_fk, id_conta_destino_fk);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertCategoriaReceita;
DELIMITER //
CREATE PROCEDURE InsertCategoriaReceita(
  IN categoria_receita VARCHAR(50),
  IN subcategoria VARCHAR(50)
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_CAT_RECEITA (CATEGORIA_RECEITA, SUB_CATEGORIA)
    VALUES (categoria_receita, subcategoria);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertReceita;
DELIMITER //
CREATE PROCEDURE InsertReceita(
  IN id_rec_lanc_fk INT,
  IN id_rec_cat_receita_fk INT
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_RECEITA (ID_REC_LANC_FK, ID_REC_CAT_RECEITA_FK)
    VALUES (id_rec_lanc_fk, id_rec_cat_receita_fk);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertCategoriaDespesa;
DELIMITER //
CREATE PROCEDURE InsertCategoriaDespesa(
  IN categoria_despesa VARCHAR(50),
  IN subcategoria_despesa VARCHAR(50)
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_CAT_DESPESA (CATEGORIA_DESPESA, SUB_CATEGORIA_DESPESA)
    VALUES (categoria_despesa, subcategoria_despesa);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertDespesa;
DELIMITER //
CREATE PROCEDURE InsertDespesa(
  IN id_desp_lanc_fk INT,
  IN id_cat_despesa_fk INT
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_DESPESA (ID_DESP_LANC_FK, ID_CAT_DESPESA_FK)
    VALUES (id_desp_lanc_fk, id_cat_despesa_fk);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertCartaoCredito;
DELIMITER //
CREATE PROCEDURE InsertCartaoCredito(
  IN nome_cartao_credito VARCHAR(20),
  IN data_vence_fatura DATE,
  IN limite_nominal DECIMAL(10,2),
  IN limite_efetivo DECIMAL(10,2),
  IN id_cc_banco_fk INT
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_CARTAO_CREDITO (NOME_CARTAO_CREDITO, DATA_VENCE_FATURA, LIMITE_NOMINAL, LIMITE_EFETIVO, ID_CC_BANCO_FK)
    VALUES (nome_cartao_credito, data_vence_fatura, limite_nominal, limite_efetivo, id_cc_banco_fk);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertLancCartaoCredito;
DELIMITER //
CREATE PROCEDURE InsertLancCartaoCredito(
  IN id_lc_lanc_fk INT,
  IN id_lc_cartao_credito_fk INT
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_LANC_CARTAO_CREDITO (ID_LC_LANC_FK, ID_LC_CARTAO_CREDITO_FK)
    VALUES (id_lc_lanc_fk, id_lc_cartao_credito_fk);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InsertFatura;
DELIMITER //
CREATE PROCEDURE InsertFatura(
  IN valor_total_fatura DECIMAL(10,2),
  IN valor_primario DECIMAL(10,2),
  IN valor_secundario DECIMAL(10,2),
  IN pago_primario DECIMAL(10,2),
  IN pago_secundario DECIMAL(10,2),
  IN date_vencimento_fatura DATE,
  IN id_ft_lc_cred_fk INT
)
BEGIN
    -- Insere os dados na tabela
    INSERT INTO TB_FATURA (VALOR_TOTAL_FATURA, VALOR_PRIMARIO, VALOR_SECUNDARIO, PAGO_PRIMARIO, PAGO_SECUNDARIO, DATE_VENCIMENTO_FATURA, ID_FT_LC_CRED_FK)
    VALUES (valor_total_fatura, valor_primario, valor_secundario, pago_primario, pago_secundario, date_vencimento_fatura, id_ft_lc_cred_fk);
END //
DELIMITER ;

-- Verifica se a procedure existe e a exclui se já existir
DROP PROCEDURE IF EXISTS InserirLimiteGastos;
DELIMITER //
CREATE PROCEDURE InserirLimiteGastos(
    IN conta_id INT,
    IN cat_despesa_id INT,
    IN limite_mensal DECIMAL(10,2)
)
BEGIN
    INSERT INTO TB_LIMITES_GASTOS (ID_LG_CONTA_FK, ID_LG_CAT_DESPESA_FK, LIMITE_MENSAL)
    VALUES (conta_id, cat_despesa_id, limite_mensal);
END //
DELIMITER ;
