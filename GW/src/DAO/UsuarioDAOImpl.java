package DAO;

import DAO_Interface.UsuarioDAO;
import Tabelas.Usuario;
import DB.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements UsuarioDAO {
    @Override
    public void inserirUsuario(Usuario usuario) {
            Connection conn = null;
            PreparedStatement stmt = null;
            try {
                conn = DB.getConnection();
                stmt = conn.prepareStatement("CALL InsertUsuario(?, ?)");
                stmt.setString(1, usuario.getNomeUsuario());
                stmt.setString(2, usuario.getSenha());
                stmt.executeUpdate();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            } finally {
                DB.closeStatement(stmt);
            }
    }

    @Override
    public void atualizarUsuarioNome(String nomeUsuarioSubstituto, String nomeUsuarioSubstituido) {
            Connection conn = null;
            PreparedStatement stmt = null;
            try {
                conn = DB.getConnection();
                stmt = conn.prepareStatement("UPDATE TB_USUARIO SET NOME_USUARIO = ? WHERE NOME_USUARIO = ?");
                stmt.setString(1, nomeUsuarioSubstituto);
                stmt.setString(2, nomeUsuarioSubstituido);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.getMessage();
            }finally {
                DB.closeStatement(stmt);
            }
    }

    @Override
    public void atualizarUsuarioSenha(String senhaUsuarioSubstituta, String senhaUsuarioSubstituida) {
            Connection conn = null;
            PreparedStatement stmt = null;
            try {
                conn = DB.getConnection();
                stmt = conn.prepareStatement("UPDATE TB_USUARIO SET NOME_USUARIO = ? WHERE NOME_USUARIO = ?");
                stmt.setString(1, senhaUsuarioSubstituta);
                stmt.setString(2, senhaUsuarioSubstituida);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.getMessage();
            }finally {
                DB.closeStatement(stmt);
            }
    }

    @Override
    public void excluirUsuario(String nomeUsuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("DELETE FROM TB_USUARIO WHERE NOME_USUARIO = ?");
            stmt.setString(1, nomeUsuario);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }finally {
            DB.closeStatement(stmt);
        }
    }

    @Override
    public Usuario buscarUsuarioPorId(int idUsuario) {
        Usuario usuario = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM TB_USUARIO WHERE ID_USUARIO = ?");
            stmt.setInt(1, idUsuario);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nomeUsuario = rs.getString("NOME_USUARIO");
                String senha = rs.getString("SENHA");

                usuario = new Usuario(idUsuario, nomeUsuario, senha);
            }
        } catch (SQLException e) {
            e.getMessage();
        }finally {
            DB.closeStatement(stmt);
        }
        return usuario;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DB.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM TB_USUARIO");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int idUsuario = rs.getInt("ID_USUARIO");
                String nomeUsuario = rs.getString("NOME_USUARIO");
                String senha = rs.getString("SENHA");

                Usuario usuario = new Usuario(idUsuario, nomeUsuario, senha);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.getMessage();
        }finally {
            DB.closeStatement(stmt);
        }
        return usuarios;
    }
}

