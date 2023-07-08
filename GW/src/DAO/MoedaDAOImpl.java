package DAO;

import DAO_Interface.MoedaDAO;
import DB.DB;
import Tabelas.Moeda;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MoedaDAOImpl implements MoedaDAO {
    @Override
    public void inserirMoeda(Moeda moeda) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try{
            conn = DB.getConnection();
            stmt = conn.prepareStatement("CALL InsertMoeda(?,?,?)");
            stmt.setInt(1, moeda.getPaisMoedaFK());
            stmt.setString(2, moeda.getSiglaMoeda());
            stmt.setString(3, moeda.getSimboloMoeda());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            DB.closeStatement(stmt);
        }
    }

    @Override
    public void atualizarMoeda(Integer paisSubstituto, Integer paisSubstituido) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("UPDATE TB_MOEDA SET ID_MOEDA_PAIS_FK = ? WHERE ID_MOEDA_PAIS_FK = ?");
            stmt.setInt(1, paisSubstituto);
            stmt.setInt(2, paisSubstituido);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            DB.closeStatement(stmt);
        }
    }

    @Override
    public void excluirMoeda(Integer idMoeda) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("DELETE FROM moeda WHERE id = ?");
            stmt.setInt(1, idMoeda);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            DB.closeStatement(stmt);
        }
    }

    @Override
    public Moeda buscarMoeda(Integer idMoeda) {
        Moeda moeda = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM TB_MOEDA WHERE id = ?");
            stmt.setInt(1, idMoeda);
            rs = stmt.executeQuery();
            if (rs.next()) {
                moeda = new Moeda(
                        rs.getInt("ID_MOEDA"),
                        rs.getInt("ID_MOEDA_PAIS_FK"),
                        rs.getString("SIGLA"),
                        rs.getString("SIMBOLO")
                );
            }

        } catch (SQLException e) {
            e.getMessage();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(stmt);
        }
        return moeda;
    }

    @Override
    public List<Moeda> listarMoeda() {
        List<Moeda> moedas = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM TB_MOEDA");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Moeda moeda = new Moeda(
                        rs.getInt("ID_MOEDA"),
                        rs.getInt("ID_MOEDA_PAIS_FK"),
                        rs.getString("SIGLA"),
                        rs.getString("SIMBOLO")
                );
                moedas.add(moeda);
            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(stmt);
        }
        return moedas;
    }
}

