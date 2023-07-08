package DAO_Interface;

import Tabelas.Lanc_CC;

import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Lançamento de Cartão de Crédito".
 */
public interface Lanc_CC_DAO {

    /**
     * Insere um novo lançamento de cartão de crédito no banco de dados.
     *
     * @param lancamentoCC O objeto do lançamento de cartão de crédito a ser inserido.
     */
    void inserir(Lanc_CC lancamentoCC);

    /**
     * Exclui um lançamento de cartão de crédito do banco de dados.
     *
     * @param idLCC O ID do lançamento de cartão de crédito a ser excluído.
     */
    void excluir(int idLCC);

    /**
     * Recupera um lançamento de cartão de crédito do banco de dados com base no seu ID.
     *
     * @param idLCC O ID do lançamento de cartão de crédito a ser recuperado.
     * @return O objeto do lançamento de cartão de crédito com o ID especificado, ou null se não encontrado.
     */
    Lanc_CC buscar(int idLCC);

    /**
     * Recupera uma lista de todos os lançamentos de cartão de crédito no banco de dados.
     *
     * @return Uma lista de todos os objetos de lançamento de cartão de crédito no banco de dados.
     */
    List<Lanc_CC> listar();
}
