
/**
 * *
 * Interface para gerenciar dados de usuários no banco de dados.
 */
package DAO_Interface;

import Tabelas.Usuario;
import java.util.List;

public interface UsuarioDAO {
    /**
     * Insere um novo usuário no banco de dados.
     *
     * @param usuario O objeto do usuário a ser inserido.
     */
    void inserirUsuario(Usuario usuario);

    /**
     * Atualiza o nome de um usuário no banco de dados.
     *
     * @param nomeUsuarioSubstituto O novo nome do usuário.
     * @param nomeUsuarioSubstituido O nome do usuário substituido.
     */
    void atualizarUsuarioNome(String nomeUsuarioSubstituto, String nomeUsuarioSubstituido);

    /**
     * Atualiza a senha de um usuário no banco de dados.
     *
     * @param senhaUsuarioSubstituta A nova senha do usuário.
     * @param senhaUsuarioSubstituida A senha do usuário substituida.
     */
    void atualizarUsuarioSenha(String senhaUsuarioSubstituta, String senhaUsuarioSubstituida);

    /**
     * Exclui um usuário do banco de dados.
     *
     * @param nomeUsuario O nome do usuário a ser excluído.
     * @param nomeUsuario O nome do usuário substituido.
     */
    void excluirUsuario(String nomeUsuario);

    /**
     * Recupera um usuário do banco de dados com base no seu ID.
     *
     * @param idUsuario O ID do usuário a ser recuperado.
     * @return O objeto do usuário com o ID especificado, ou null se não encontrado.
     */
    Usuario buscarUsuarioPorId(int idUsuario);

    /**
     * Recupera uma lista de todos os usuários no banco de dados.
     *
     * @return Uma lista de todos os objetos de usuário no banco de dados.
     */
    List<Usuario> listarUsuarios();
}

