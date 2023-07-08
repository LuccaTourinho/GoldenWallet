package DAO_Interface;

import Tabelas.Pais;
import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Pais".
 */
public interface PaisDAO {

    /**
     * Insere um novo país no banco de dados.
     *
     * @param pais O objeto do país a ser inserido.
     */
    void inserirPais(Pais pais);

    /**
     * Atualiza o nome e a sigla de um país no banco de dados.
     *
     * @param nomeSubstituto    O novo nome do país.
     * @param siglaSubstituta   A nova sigla do país.
     * @param nomeSubstituida   O nome do país a ser substituído.
     * @param siglaSubstituida  A sigla do país a ser substituída.
     */
    void atualizarPaisNomeSigla(String nomeSubstituto, String siglaSubstituta, String nomeSubstituida, String siglaSubstituida);

    /**
     * Exclui um país do banco de dados.
     *
     * @param nome O nome do país a ser excluído.
     */
    void excluirPais(String nome);

    /**
     * Recupera um país do banco de dados com base no seu ID.
     *
     * @param idPais O ID do país a ser recuperado.
     * @return O objeto do país com o ID especificado, ou null se não encontrado.
     */
    Pais buscarPaisporID(int idPais);

    /**
     * Recupera uma lista de todos os países no banco de dados.
     *
     * @return Uma lista de todos os objetos de país no banco de dados.
     */
    List<Pais> listarPais();
}

