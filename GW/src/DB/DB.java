package DB;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*

import java.io.FileInputStream;: Importa a classe FileInputStream do pacote java.io,
que permite ler dados de um arquivo em bytes.

import java.io.IOException;: Importa a classe IOException do pacote java.io,
que é uma exceção lançada em casos de falha na operação de entrada/saída.

import java.sql.Connection;: Importa a interface Connection do pacote java.sql,
que representa uma conexão com um banco de dados.

import java.sql.DriverManager;: Importa a classe DriverManager do pacote java.sql,
que gerencia os drivers de banco de dados e fornece métodos para estabelecer conexões com o banco de dados.

import java.sql.ResultSet;: Importa a interface ResultSet do pacote java.sql,
que representa um conjunto de resultados obtidos a partir de uma consulta SQL.

import java.sql.SQLException;: Importa a classe SQLException do pacote java.sql,
que é uma exceção lançada em casos de erros relacionados ao banco de dados.

import java.sql.Statement;: Importa a interface Statement do pacote java.sql,
que é usada para executar instruções SQL e retornar os resultados.

import java.util.Properties;: Importa a classe Properties do pacote java.util,
que representa uma coleção de pares chave-valor, frequentemente utilizada para armazenar configurações e propriedades.

*/


/**
 * Classe que gerencia a conexão com o banco de dados e fornece métodos para fechar recursos relacionados ao banco de dados.
 */
public class DB {

    private static Connection conn = null;

    /**
     * Obtém a conexão com o banco de dados.
     *
     * @return a conexão com o banco de dados
     */

    public static Connection getConnection() {
        if (conn == null) {
            try {

                Properties props = loadProperties();
                String url = props.getProperty("db.url");
                String user = props.getProperty("db.user");
                String password = props.getProperty("db.password");
                conn = DriverManager.getConnection(url, user, password);
            }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }


    /**
     * Fecha a conexão com o banco de dados.
     */
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            }
            catch (SQLException e) {
                throw new DbException("A conexão não existe");
            }
        }
    }

    /**
     * Carrega as propriedades de configuração do banco de dados.
     *
     * @return as propriedades carregadas
     */
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("C:/Users/lucca/OneDrive/Documentos/SQL/database.properties")){
            Properties props = new Properties();
            props.load(fs);
            return props;
        }
        catch (IOException e) {
            throw new DbException("database.properties não foi encontrado");
        }
    }

    /**
     * Fecha o statement.
     *
     * @param st o statement a ser fechado
     */
    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            }
            catch (SQLException e) {
                throw new DbException("O statement é null");
            }
        }
    }

    /**
     * Fecha o ResultSet.
     *
     * @param rs o ResultSet a ser fechado
     */
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            }
            catch (SQLException e) {
                throw new DbException("O ResultSet é null");
            }
        }
    }
}
