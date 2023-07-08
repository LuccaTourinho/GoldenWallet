package DAO_Interface;

import Tabelas.Transferencia;

import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Transferencia".
 */
public interface TransferenciaDAO {

    /**
     * Insere uma nova transferência no banco de dados.
     *
     * @param trans O objeto da transferência a ser inserida.
     */
    void inserir(Transferencia trans);

    /**
     * Exclui uma transferência do banco de dados.
     *
     * @param idTrans O ID da transferência a ser excluída.
     */
    void excluir(Integer idTrans);

    /**
     * Recupera uma transferência do banco de dados com base no seu ID.
     *
     * @param idTrans O ID da transferência a ser recuperada.
     * @return O objeto da transferência com o ID especificado, ou null se não encontrado.
     */
    Transferencia buscar(Integer idTrans);

    /**
     * Recupera uma lista de todas as transferências no banco de dados.
     *
     * @return Uma lista de todos os objetos de transferência no banco de dados.
     */
    List<Transferencia> listar();
}
