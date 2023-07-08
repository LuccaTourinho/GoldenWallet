package DAO_Interface;

import Tabelas.Moeda;

import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Moeda".
 */
public interface MoedaDAO {

    /**
     * Insere uma nova moeda no banco de dados.
     *
     * @param moeda O objeto a ser inserido
     */
    void inserirMoeda(Moeda moeda);

    /**
     * Atualiza as informações de uma moeda no banco de dados.
     *
     * @param paisSubstituto     O novo ID do país associado à moeda.
     * @param paisSubstituido    O ID do país associado à moeda a ser substituída.
     */
    void atualizarMoeda(Integer paisSubstituto, Integer paisSubstituido);

    /**
     * Exclui uma moeda do banco de dados.
     *
     * @param idMoeda O ID da moeda a ser excluída.
     */
    void excluirMoeda(Integer idMoeda);

    /**
     * Recupera uma moeda do banco de dados com base no seu ID.
     *
     * @param idMoeda O ID da moeda a ser recuperada.
     * @return O objeto da moeda com o ID especificado, ou null se não encontrado.
     */
    Moeda buscarMoeda(Integer idMoeda);

    /**
     * Recupera uma lista de todas as moedas no banco de dados.
     *
     * @return Uma lista de todos os objetos de moeda no banco de dados.
     */
    List<Moeda> listarMoeda();
}

