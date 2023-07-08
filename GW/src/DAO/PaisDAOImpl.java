package DAO;

import DAO_Interface.PaisDAO;
import Tabelas.Pais;
import DB.DB;
import DB.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaisDAOImpl implements PaisDAO {
    @Override
    public void inserirPais(Pais pais) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("CALL InsertPais(?, ?)");
            stmt.setString(1, pais.getNomePais());
            stmt.setString(2, pais.getSiglaPais());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            DB.closeStatement(stmt);
        }
    }

    @Override
    public void atualizarPaisNomeSigla(String nomeSubstituto, String siglaSubstituta, String nomeSubstituida, String siglaSubstituida) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("UPDATE TB_PAIS SET NOME_PAIS = ?, SIGLA = ? WHERE NOME_PAIS = ? AND SIGLA = ?");
            stmt.setString(1, nomeSubstituto);
            stmt.setString(2, siglaSubstituta);
            stmt.setString(3, nomeSubstituida);
            stmt.setString(4, siglaSubstituida);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            DB.closeStatement(stmt);
        }
    }

    @Override
    public void excluirPais(String nome) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("DELETE FROM TB_PAIS WHERE NOME_PAIS = ?");
            stmt.setString(1, nome);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            DB.closeStatement(stmt);
        }
    }

    @Override
    public Pais buscarPaisporID(int idPais) {
        Pais pais = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM TB_PAIS WHERE ID_PAIS = ?");
            stmt.setInt(1, idPais);
            rs = stmt.executeQuery();

            if (rs.next()) {
                String nomePais = rs.getString("NOME_PAIS");
                String sigla = rs.getString("SIGLA");

                pais = new Pais(idPais, nomePais, sigla);
            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(stmt);
        }
        return pais;
    }

    @Override
    public List<Pais> listarPais() {
        List<Pais> paises = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM TB_PAIS");
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idPais = rs.getInt("ID_PAIS");
                String nomePais = rs.getString("NOME_PAIS");
                String sigla = rs.getString("SIGLA");

                Pais pais = new Pais(idPais, nomePais, sigla);
                paises.add(pais);
            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(stmt);
        }
        return paises;
    }
}
