package DAO_Interface;

import Tabelas.Categoria_Receita;
import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Categoria de Receita".
 */
public interface CAT_RECEITA_DAO {

    /**
     * Insere uma nova categoria de receita no banco de dados.
     *
     * @param CR O objeto da categoria de receita a ser inserida.
     */
    void inserirCR(Categoria_Receita CR);

    /**
     * Atualiza as informações de uma categoria de receita no banco de dados.
     *
     * @param CRSubstituta    A nova categoria de receita.
     * @param SCSubstituta    O novo subcategoria de receita.
     * @param CRSubstituida   A categoria de receita a ser substituída.
     * @param SCSubstituida   A subcategoria de receita a ser substituída.
     */
    void atualizarCR(String CRSubstituta, String SCSubstituta, String CRSubstituida, String SCSubstituida);

    /**
     * Exclui uma categoria de receita do banco de dados.
     *
     * @param CR A categoria de receita a ser excluída.
     * @param SC A subcategoria de receita a ser excluída.
     */
    void excluirCR(String CR, String SC);

    /**
     * Recupera uma categoria de receita do banco de dados com base no seu ID.
     *
     * @param idCR O ID da categoria de receita a ser recuperada.
     * @return O objeto da categoria de receita com o ID especificado, ou null se não encontrado.
     */
    Categoria_Receita buscarCRporID(int idCR);

    /**
     * Recupera uma lista de todas as categorias de receita no banco de dados.
     *
     * @return Uma lista de todos os objetos de categoria de receita no banco de dados.
     */
    List<Categoria_Receita> listarCR();
}

