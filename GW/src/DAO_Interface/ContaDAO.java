package DAO_Interface;

import Tabelas.Conta;

import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Conta".
 */
public interface ContaDAO {

    /**
     * Insere uma nova conta no banco de dados.
     *
     * @param conta O objeto a ser inserido
     */
    void inserir(Conta conta);

    /**
     * Atualiza o nome de uma conta no banco de dados.
     *
     * @param nomeNEW O novo nome da conta.
     * @param nomeOLD O nome da conta a ser substituída.
     */
    void atualizar(String nomeNEW, String nomeOLD);

    /**
     * Exclui uma conta do banco de dados.
     *
     * @param nome O nome da conta a ser excluída.
     */
    void excluir(String nome);

    /**
     * Recupera uma conta do banco de dados com base no seu ID.
     *
     * @param idConta O ID da conta a ser recuperada.
     * @return O objeto da conta com o ID especificado, ou null se não encontrado.
     */
    Conta buscar(Integer idConta);

    /**
     * Recupera uma lista de todas as contas no banco de dados.
     *
     * @return Uma lista de todos os objetos de conta no banco de dados.
     */
    List<Conta> listar();
}

