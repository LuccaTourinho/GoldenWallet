package DAO_Interface;

import Tabelas.Limites_Gastos;

import java.util.List;

import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Limites_Gastos".
 */
public interface LG_DAO {

    /**
     * Insere um novo limite de gastos no banco de dados.
     *
     * @param lg O objeto do limite de gastos a ser inserido.
     */
    void inserir(Limites_Gastos lg);

    /**
     * Exclui um limite de gastos do banco de dados.
     *
     * @param idLG O ID do limite de gastos a ser excluído.
     */
    void excluir(int idLG);

    /**
     * Recupera um limite de gastos do banco de dados com base no seu ID.
     *
     * @param idLG O ID do limite de gastos a ser recuperado.
     * @return O objeto do limite de gastos com o ID especificado, ou null se não encontrado.
     */
    Limites_Gastos buscar(int idLG);

    /**
     * Recupera uma lista de todos os limites de gastos no banco de dados.
     *
     * @return Uma lista de todos os objetos de limite de gastos no banco de dados.
     */
    List<Limites_Gastos> listar();
}

