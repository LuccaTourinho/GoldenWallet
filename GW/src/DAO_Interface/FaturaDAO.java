package DAO_Interface;


import Tabelas.Fatura;

import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Fatura".
 */
public interface FaturaDAO {

    /**
     * Insere uma nova fatura no banco de dados.
     *
     * @param fatura O objeto da fatura a ser inserida.
     */
    void inserir(Fatura fatura);

    /**
     * Exclui uma fatura do banco de dados.
     *
     * @param idFatura O ID da fatura a ser excluída.
     */
    void excluir(int idFatura);

    /**
     * Recupera uma fatura do banco de dados com base no seu ID.
     *
     * @param idFatura O ID da fatura a ser recuperada.
     * @return O objeto da fatura com o ID especificado, ou null se não encontrado.
     */
    Fatura buscar(int idFatura);

    /**
     * Recupera uma lista de todas as faturas no banco de dados.
     *
     * @return Uma lista de todos os objetos de fatura no banco de dados.
     */
    List<Fatura> listar();
}
