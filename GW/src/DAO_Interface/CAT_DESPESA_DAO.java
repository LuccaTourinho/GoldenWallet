package DAO_Interface;

import Tabelas.Categoria_Despesa;
import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Categoria de Despesa".
 */
public interface CAT_DESPESA_DAO {

    /**
     * Insere uma nova categoria de despesa no banco de dados.
     *
     * @param CD O objeto da categoria de despesa a ser inserida.
     */
    void inserirCP(Categoria_Despesa CD);

    /**
     * Atualiza as informações de uma categoria de despesa no banco de dados.
     *
     * @param CDSubstituta    A nova categoria de despesa.
     * @param SCSubstituta    O novo subcategoria de despesa.
     * @param CDSubstituida   A categoria de despesa a ser substituída.
     * @param SCSubstituida   A subcategoria de despesa a ser substituída.
     */
    void atualizarCD(String CDSubstituta, String SCSubstituta, String CDSubstituida, String SCSubstituida);

    /**
     * Exclui uma categoria de despesa do banco de dados.
     *
     * @param CD A categoria de despesa a ser excluída.
     * @param SC A subcategoria de despesa a ser excluída.
     */
    void excluirCD(String CD, String SC);

    /**
     * Recupera uma categoria de despesa do banco de dados com base no seu ID.
     *
     * @param idCD O ID da categoria de despesa a ser recuperada.
     * @return O objeto da categoria de despesa com o ID especificado, ou null se não encontrado.
     */
    Categoria_Despesa buscarCDporID(int idCD);

    /**
     * Recupera uma lista de todas as categorias de despesa no banco de dados.
     *
     * @return Uma lista de todos os objetos de categoria de despesa no banco de dados.
     */
    List<Categoria_Despesa> listarCD();
}

