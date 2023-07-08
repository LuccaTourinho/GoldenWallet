package Tabelas;

import java.time.LocalDate;

public class Cartao_Credito {
    private Integer id;
    private String nome;
    private LocalDate data_vence_fatura;
    private Double limite_nominal;
    private Double limite_efetivo;
    private Integer banco;

    /**
     * Construtor padrão da classe Cartao_Credito.
     */
    public Cartao_Credito() {}

    /**
     * Construtor da classe Cartao_Credito com os parâmetros fornecidos.
     *
     * @param nome                o nome do cartão de crédito
     * @param data_vence_fatura   a data de vencimento da fatura
     * @param limite_nominal      o limite nominal do cartão de crédito
     * @param limite_efetivo      o limite efetivo do cartão de crédito
     * @param banco               o ID do banco associado ao cartão de crédito
     */
    public Cartao_Credito(String nome, LocalDate data_vence_fatura, Double limite_nominal, Double limite_efetivo, Integer banco) {
        this.nome = nome;
        this.data_vence_fatura = data_vence_fatura;
        this.limite_nominal = limite_nominal;
        this.limite_efetivo = limite_efetivo;
        this.banco = banco;
    }

    /**
     * Construtor da classe Cartao_Credito com ID e os demais parâmetros fornecidos.
     *
     * @param id                  o ID do cartão de crédito
     * @param nome                o nome do cartão de crédito
     * @param data_vence_fatura   a data de vencimento da fatura
     * @param limite_nominal      o limite nominal do cartão de crédito
     * @param limite_efetivo      o limite efetivo do cartão de crédito
     * @param banco               o ID do banco associado ao cartão de crédito
     */
    public Cartao_Credito(Integer id, String nome, LocalDate data_vence_fatura, Double limite_nominal, Double limite_efetivo, Integer banco) {
        this.id = id;
        this.nome = nome;
        this.data_vence_fatura = data_vence_fatura;
        this.limite_nominal = limite_nominal;
        this.limite_efetivo = limite_efetivo;
        this.banco = banco;
    }

    /**
     * Obtém o ID do cartão de crédito.
     *
     * @return o ID do cartão de crédito
     */
    public Integer getIdCC() {
        return id;
    }

    /**
     * Define o ID do cartão de crédito.
     *
     * @param id o ID do cartão de crédito
     */
    public void setIdCC(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o nome do cartão de crédito.
     *
     * @return o nome do cartão de crédito
     */
    public String getNomeCC() {
        return nome;
    }

    /**
     * Define o nome do cartão de crédito.
     *
     * @param nome o nome do cartão de crédito
     */
    public void setNomeCC(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a data de vencimento da fatura.
     *
     * @return a data de vencimento da fatura
     */
    public LocalDate getData_vence_fatura() {
        return data_vence_fatura;
    }

    /**
     * Define a data de vencimento da fatura.
     *
     * @param data_vence_fatura a data de vencimento da fatura
     */
    public void setData_vence_fatura(LocalDate data_vence_fatura) {
        this.data_vence_fatura = data_vence_fatura;
    }

    /**
     * Obtém o limite nominal do cartão de crédito.
     *
     * @return o limite nominal do cartão de crédito
     */
    public Double getLimite_nominal() {
        return limite_nominal;
    }

    /**
     * Define o limite nominal do cartão de crédito.
     *
     * @param limite_nominal o limite nominal do cartão de crédito
     */
    public void setLimite_nominal(Double limite_nominal) {
        this.limite_nominal = limite_nominal;
    }

    /**
     * Obtém o limite efetivo do cartão de crédito.
     *
     * @return o limite efetivo do cartão de crédito
     */
    public Double getLimite_efetivo() {
        return limite_efetivo;
    }

    /**
     * Define o limite efetivo do cartão de crédito.
     *
     * @param limite_efetivo o limite efetivo do cartão de crédito
     */
    public void setLimite_efetivo(Double limite_efetivo) {
        this.limite_efetivo = limite_efetivo;
    }

    /**
     * Obtém o ID do banco associado ao cartão de crédito.
     *
     * @return o ID do banco associado ao cartão de crédito
     */
    public Integer getBancoFK() {
        return banco;
    }

    /**
     * Define o ID do banco associado ao cartão de crédito.
     *
     * @param banco o ID do banco associado ao cartão de crédito
     */
    public void setBancoFK(Integer banco) {
        this.banco = banco;
    }
}
