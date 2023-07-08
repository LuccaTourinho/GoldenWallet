package Tabelas;

import java.time.LocalDate;

public class Lancamento {
    private Integer id;
    private Double valor;
    private LocalDate data;
    private String descricao;
    private Boolean status;
    private byte[] anexo;
    private Integer conta;

    /**
     * Construtor padrão da classe Lancamento.
     */
    public Lancamento() {}

    /**
     * Construtor da classe Lancamento com valor, data, descrição, status, anexo e conta.
     *
     * @param valor     o valor do lançamento
     * @param data      a data do lançamento
     * @param descricao a descrição do lançamento
     * @param status    o status do lançamento
     * @param anexo     o anexo do lançamento
     * @param conta     o ID da conta associada ao lançamento
     */
    public Lancamento(Double valor, LocalDate data, String descricao, Boolean status, byte[] anexo, Integer conta) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.status = status;
        this.anexo = anexo;
        this.conta = conta;
    }

    /**
     * Construtor da classe Lancamento com ID, valor, data, descrição, status, anexo e conta.
     *
     * @param id        o ID do lançamento
     * @param valor     o valor do lançamento
     * @param data      a data do lançamento
     * @param descricao a descrição do lançamento
     * @param status    o status do lançamento
     * @param anexo     o anexo do lançamento
     * @param conta     o ID da conta associada ao lançamento
     */
    public Lancamento(Integer id, Double valor, LocalDate data, String descricao, Boolean status, byte[] anexo, Integer conta) {
        this.id = id;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.status = status;
        this.anexo = anexo;
        this.conta = conta;
    }

    /**
     * Obtém o ID do lançamento.
     *
     * @return o ID do lançamento
     */
    public Integer getIdLancamento() {
        return id;
    }

    /**
     * Define o ID do lançamento.
     *
     * @param id o ID do lançamento
     */
    public void setIdLancamento(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o valor do lançamento.
     *
     * @return o valor do lançamento
     */
    public Double getValorLancamento() {
        return valor;
    }

    /**
     * Define o valor do lançamento.
     *
     * @param valor o valor do lançamento
     */
    public void setValorLancamento(Double valor) {
        this.valor = valor;
    }

    /**
     * Obtém a data do lançamento.
     *
     * @return a data do lançamento
     */
    public LocalDate getDataLancamento() {
        return data;
    }

    /**
     * Define a data do lançamento.
     *
     * @param data a data do lançamento
     */
    public void setDataLancamento(LocalDate data) {
        this.data = data;
    }

    /**
     * Obtém a descrição do lançamento.
     *
     * @return a descrição do lançamento
     */
    public String getDescricaoLancamento() {
        return descricao;
    }

    /**
     * Define a descrição do lançamento.
     *
     * @param descricao a descrição do lançamento
     */
    public void setDescricaoLancamento(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o status do lançamento.
     *
     * @return o status do lançamento
     */
    public Boolean getStatusLancamento() {
        return status;
    }

    /**
     * Define o status do lançamento.
     *
     * @param status o status do lançamento
     */
    public void setStatusLancamento(Boolean status) {
        this.status = status;
    }

    /**
     * Obtém o anexo do lançamento.
     *
     * @return o anexo do lançamento
     */
    public byte[] getAnexo() {
        return anexo;
    }

    /**
     * Define o anexo do lançamento.
     *
     * @param anexo o anexo do lançamento
     */
    public void setAnexo(byte[] anexo) {
        this.anexo = anexo;
    }

    /**
     * Obtém o ID da conta associada ao lançamento.
     *
     * @return o ID da conta associada ao lançamento
     */
    public Integer getContaFK() {
        return conta;
    }

    /**
     * Define o ID da conta associada ao lançamento.
     *
     * @param conta o ID da conta associada ao lançamento
     */
    public void setContaFK(Integer conta) {
        this.conta = conta;
    }
}

