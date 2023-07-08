package DAO_Interface;

import Tabelas.Cartao_Credito;

import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Cartão de Crédito".
 */
public interface CC_DAO {

    /**
     * Insere um novo cartão de crédito no banco de dados.
     *
     * @param cartaoCredito O objeto do cartão de crédito a ser inserido.
     */
    void inserir(Cartao_Credito cartaoCredito);

    /**
     * Exclui um cartão de crédito do banco de dados.
     *
     * @param idCC O ID do cartão de crédito a ser excluído.
     */
    void excluir(int idCC);

    /**
     * Recupera um cartão de crédito do banco de dados com base no seu ID.
     *
     * @param idCC O ID do cartão de crédito a ser recuperado.
     * @return O objeto do cartão de crédito com o ID especificado, ou null se não encontrado.
     */
    Cartao_Credito buscar(int idCC);

    /**
     * Recupera uma lista de todos os cartões de crédito no banco de dados.
     *
     * @return Uma lista de todos os objetos de cartão de crédito no banco de dados.
     */
    List<Cartao_Credito> listar();
}
