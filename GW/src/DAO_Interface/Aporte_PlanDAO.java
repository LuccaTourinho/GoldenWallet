package DAO_Interface;

import Tabelas.Aporte_Plan;

import java.util.List;


/**
 * Interface que define as operações de acesso a dados para a entidade "Aporte_Plan".
 */
public interface Aporte_PlanDAO {

    /**
     * Insere um novo aporte do plano no banco de dados.
     *
     * @param AP O objeto do aporte do plano a ser inserido.
     */
    void inserir(Aporte_Plan AP);

    /**
     * Exclui um aporte do plano do banco de dados.
     *
     * @param idAP O ID do aporte do plano a ser excluído.
     */
    void excluir(Integer idAP);

    /**
     * Recupera um aporte do plano do banco de dados com base no seu ID.
     *
     * @param idAP O ID do aporte do plano a ser recuperado.
     * @return O objeto do aporte do plano com o ID especificado, ou null se não encontrado.
     */
    Aporte_Plan buscar(Integer idAP);

    /**
     * Recupera uma lista de todos os aportes do plano no banco de dados.
     *
     * @return Uma lista de todos os objetos de aporte do plano no banco de dados.
     */
    List<Aporte_Plan> listar();
}
