package DAO_Interface;

import Tabelas.Despesa;

import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Despesa".
 */
public interface DespesaDAO {

    /**
     * Insere uma nova despesa no banco de dados.
     *
     * @param despesa O objeto da despesa a ser inserida.
     */
    void inserir(Despesa despesa);

    /**
     * Exclui uma despesa do banco de dados.
     *
     * @param idDespesa O ID da despesa a ser excluída.
     */
    void excluir(int idDespesa);

    /**
     * Recupera uma despesa do banco de dados com base no seu ID.
     *
     * @param idDespesa O ID da despesa a ser recuperada.
     * @return O objeto da despesa com o ID especificado, ou null se não encontrado.
     */
    Despesa buscar(int idDespesa);

    /**
     * Recupera uma lista de todas as despesas no banco de dados.
     *
     * @return Uma lista de todos os objetos de despesa no banco de dados.
     */
    List<Despesa> listar();
}
