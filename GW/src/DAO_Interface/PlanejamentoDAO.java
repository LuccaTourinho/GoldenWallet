package DAO_Interface;

import Tabelas.Planejamento;

import java.time.LocalDate;
import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Planejamento".
 */
public interface PlanejamentoDAO {

    /**
     * Insere um novo planejamento no banco de dados.
     *
     * @param planejamento O objeto do planejamento a ser inserido.
     */
    void inserirPlanejamento(Planejamento planejamento);

    /**
     * Atualiza as informações de um planejamento no banco de dados.
     *
     * @param nomeSubstituto     O novo nome do planejamento.
     * @param VTSubstituto       O novo valor total do planejamento.
     * @param DISubstituta       A nova data de início do planejamento.
     * @param DTSubstituta       A nova data de término do planejamento.
     * @param VISubstituto       O novo valor investido no planejamento.
     * @param nomeSubstituido    O nome do planejamento a ser substituído.
     * @param VTSubstituido      O valor total do planejamento a ser substituído.
     * @param DISubstituida     A data de início do planejamento a ser substituída.
     * @param DTSubstituida     A data de término do planejamento a ser substituída.
     * @param VISubstituido     O valor investido no planejamento a ser substituído.
     */
    void atualizarPlanejamento(
            String nomeSubstituto, Double VTSubstituto, LocalDate DISubstituta, LocalDate DTSubstituta, Double VISubstituto,
            String nomeSubstituido, Double VTSubstituido, LocalDate DISubstituida, LocalDate DTSubstituida, Double VISubstituido
    );

    /**
     * Exclui um planejamento do banco de dados.
     *
     * @param idPlanejamento O ID do planejamento a ser excluído.
     */
    void excluirPlanejamento(Integer idPlanejamento);

    /**
     * Recupera um planejamento do banco de dados com base no seu ID.
     *
     * @param idPlanejamento O ID do planejamento a ser recuperado.
     * @return O objeto do planejamento com o ID especificado, ou null se não encontrado.
     */
    Planejamento buscarPlanejamentoPeloID(Integer idPlanejamento);

    /**
     * Recupera uma lista de todos os planejamentos no banco de dados.
     *
     * @return Uma lista de todos os objetos de planejamento no banco de dados.
     */
    List<Planejamento> listarPlan();
}

