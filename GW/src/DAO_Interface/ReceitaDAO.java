package DAO_Interface;


import Tabelas.Receita;

import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Receita".
 */
public interface ReceitaDAO {

    /**
     * Insere uma nova receita no banco de dados.
     *
     * @param receita O objeto da receita a ser inserida.
     */
    void inserir(Receita receita);

    /**
     * Exclui uma receita do banco de dados.
     *
     * @param idReceita O ID da receita a ser excluída.
     */
    void excluir(int idReceita);

    /**
     * Recupera uma receita do banco de dados com base no seu ID.
     *
     * @param idReceita O ID da receita a ser recuperada.
     * @return O objeto da receita com o ID especificado, ou null se não encontrado.
     */
    Receita buscar(int idReceita);

    /**
     * Recupera uma lista de todas as receitas no banco de dados.
     *
     * @return Uma lista de todos os objetos de receita no banco de dados.
     */
    List<Receita> listar();
}
