package DAO_Interface;

import Tabelas.Banco;
import java.util.List;

/**
 * Interface que define as operações de acesso a dados para a entidade "Banco".
 */
public interface BancoDAO {

    /**
     * Insere um novo banco no banco de dados.
     *
     * @param banco O objeto do banco a ser inserido.
     */
    void inserirBanco(Banco banco);

    /**
     * Atualiza as informações de um banco no banco de dados.
     *
     * @param nomeSubstituto     O novo nome do banco.
     * @param codigoSubstituto   O novo código do banco.
     * @param siglaSubstituta    A nova sigla do banco.
     * @param nomeSubstituido    O nome do banco a ser substituído.
     * @param codigoSubstituido  O código do banco a ser substituído.
     * @param siglaSubstituida   A sigla do banco a ser substituída.
     */
    void atualizarBanco(String nomeSubstituto, String codigoSubstituto, String siglaSubstituta,
                        String nomeSubstituido, String codigoSubstituido, String siglaSubstituida);

    /**
     * Exclui um banco do banco de dados.
     *
     * @param codigo O código do banco a ser excluído.
     */
    void excluirBanco(String codigo);

    /**
     * Recupera um banco do banco de dados com base no seu ID.
     *
     * @param idBanco O ID do banco a ser recuperado.
     * @return O objeto do banco com o ID especificado, ou null se não encontrado.
     */
    Banco buscarBancoPorID(int idBanco);

    /**
     * Recupera uma lista de todos os bancos no banco de dados.
     *
     * @return Uma lista de todos os objetos de banco no banco de dados.
     */
    List<Banco> listarBanco();
}

