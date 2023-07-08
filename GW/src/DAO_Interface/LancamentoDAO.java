package DAO_Interface;


import Tabelas.Lancamento;
import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Lançamento".
 */
public interface LancamentoDAO {

    /**
     * Insere um novo lançamento no banco de dados.
     *
     * @param lanc O objeto a ser inserido
     */
    void inserir(Lancamento lanc);

    /**
     * Atualiza o status de um lançamento no banco de dados.
     *
     * @param status O novo status do lançamento.
     */
    void atualizar(Boolean status);

    /**
     * Exclui um lançamento do banco de dados.
     *
     * @param id O ID do lançamento a ser excluído.
     */
    void excluir(Integer id);

    /**
     * Recupera um lançamento do banco de dados com base no seu ID.
     *
     * @param id O ID do lançamento a ser recuperado.
     * @return O objeto do lançamento com o ID especificado, ou null se não encontrado.
     */
    Lancamento buscar(Integer id);

    /**
     * Recupera uma lista de todos os lançamentos no banco de dados.
     *
     * @return Uma lista de todos os objetos de lançamento no banco de dados.
     */
    List<Lancamento> listar();
}

