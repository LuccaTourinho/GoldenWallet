-- Passo 8

-- Dicionario de dados

SELECT TABLE_NAME AS 'Tabela',
       COLUMN_NAME AS 'Coluna',
       COLUMN_TYPE AS 'Tipo',
       IS_NULLABLE AS 'Pode ser nulo',
       COLUMN_KEY AS 'Chave',
       COLUMN_DEFAULT AS 'Valor padrão',
       EXTRA AS 'Extra',
       COLUMN_COMMENT AS 'Comentário'
FROM INFORMATION_SCHEMA.COLUMNS
WHERE TABLE_SCHEMA = 'golden_wallet';
