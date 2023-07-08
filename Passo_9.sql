-- Testar Regra 1.
/*

PROFESSOR, LEMBRE-SE QUE A PARTE AONDE ESTÁ AS CHAVES ESTRANGEIRAS SEJA DIFERENTE PRA VOCÊ.
NÓS JÁ TINHAMOS FEITOS TESTES ANTES E A CHAVE PRIMARIA É AUTO IMCREMENTAL, POR ISSO NEM TODAS CHAVES ESTRANGEIRAS SÃO 1.

*/
-- Fazer as inserções para preencher o banco.

-- Sem foreign key
CALL InsertUsuario("Lucca","041199");
CALL InsertPais("Brasil","BRA");
CALL InsertBanco("Itau","9827365549","IU");
CALL InsertCategoriaDespesa("Infraestrutura","Iluminacao");
CALL InsertCategoriaReceita("Vendas","Pizza");
CALL InsertPlanejamento('Viajem', 900.00, STR_TO_DATE('01/06/2023', '%d/%m/%Y'), STR_TO_DATE('30/06/2023', '%d/%m/%Y'), 300.00);

-- Selects

SELECT * FROM tb_usuario;
SELECT * FROM tb_pais;
SELECT * FROM tb_banco;
SELECT * FROM tb_cat_despesa;
SELECT * FROM tb_cat_receita;
SELECT * FROM tb_planejamento;

-- Com foreign key

CALL InsertMoeda(8,"BR$","R$");
CALL InsertConta("Megazord",10000.00,1,4,13);
-- Exemplo apenas, pode ser null SET @conteudo_anexo = LOAD_FILE('C:/Users/lucca/OneDrive/Documentos/roteiro.pdf');
CALL InsertLancamento(100.00, '2023-06-07', 'Pagando academia', 1, @conteudo_anexo, 1);
CALL InsertAportePlanejamento(1,1);
CALL InsertTransferencia(1,1);
CALL InsertReceita(1,1);
CALL InsertCartaoCredito('Nome do Cartão', '2023-06-30', 1000.00, 800.00, 1);
CALL InsertLancCartaoCredito(1,1);
CALL InsertFatura(1000.00, 800.00, 200.00, 800.00, 150.00, '2023-06-30', 1);

-- Selects

SELECT * FROM tb_moeda;
SELECT * FROM tb_conta;
SELECT * FROM tb_lancamento;
SELECT * FROM tb_aporte_plan;
SELECT * FROM tb_transferencia;
SELECT * FROM tb_receita;
SELECT * FROM tb_cartao_credito;
SELECT * FROM tb_lanc_cartao_credito;
SELECT * FROM tb_fatura;

INSERT INTO tb_limites_gastos (ID_LG_CONTA_FK,ID_LG_CAT_DESPESA_FK,LIMITE_MENSAL)
VALUES (1,1,50.00);
CALL InsertDespesa(1,1);

-- Os selects para eu ver e prencher corretamente as tabelas.

SELECT * FROM tb_limites_gastos;
SELECT * FROM tb_despesa;


DELETE FROM TB_DESPESA WHERE ID_DESPESA >0;

-- Aqui é que vamos ver se foi feito corretamente, aonde é testado a primeira regra.
CALL consultar_valor_ultrapassado();
