package Tabelas;

import java.time.LocalDate;

public class Planejamento {
    private Integer id;
    private String nome;
    private Double valorTotal;
    private LocalDate data_inicio;
    private LocalDate data_termino;
    private LocalDate valor_inicial;

    /**
     * Construtor padrão da classe Planejamento.
     */
    public Planejamento() {}

    /**
     * Construtor da classe Planejamento com nome, valor total, datas de início e término, e valor inicial.
     *
     * @param nome          o nome do planejamento
     * @param valorTotal    o valor total do planejamento
     * @param data_inicio   a data de início do planejamento
     * @param data_termino  a data de término do planejamento
     * @param valor_inicial o valor inicial do planejamento
     */
    public Planejamento(String nome, Double valorTotal, LocalDate data_inicio, LocalDate data_termino, LocalDate valor_inicial) {
        this.nome = nome;
        this.valorTotal = valorTotal;
        this.data_inicio = data_inicio;
        this.data_termino = data_termino;
        this.valor_inicial = valor_inicial;
    }

    /**
     * Construtor da classe Planejamento com ID, nome, valor total, datas de início e término, e valor inicial.
     *
     * @param id            o ID do planejamento
     * @param nome          o nome do planejamento
     * @param valorTotal    o valor total do planejamento
     * @param data_inicio   a data de início do planejamento
     * @param data_termino  a data de término do planejamento
     * @param valor_inicial o valor inicial do planejamento
     */
    public Planejamento(Integer id, String nome, Double valorTotal, LocalDate data_inicio, LocalDate data_termino, LocalDate valor_inicial) {
        this.id = id;
        this.nome = nome;
        this.valorTotal = valorTotal;
        this.data_inicio = data_inicio;
        this.data_termino = data_termino;
        this.valor_inicial = valor_inicial;
    }

    /**
     * Obtém o ID do planejamento.
     *
     * @return o ID do planejamento
     */
    public Integer getIdPlanejamento() {
        return id;
    }

    /**
     * Define o ID do planejamento.
     *
     * @param id o ID do planejamento
     */
    public void setIdPlanejamento(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o nome do planejamento.
     *
     * @return o nome do planejamento
     */
    public String getNomePlanejamento() {
        return nome;
    }

    /**
     * Define o nome do planejamento.
     *
     * @param nome o nome do planejamento
     */
    public void setNomePlanejamento(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o valor total do planejamento.
     *
     * @return o valor total do planejamento
     */
    public Double getValorTotalPlanejamento() {
        return valorTotal;
    }

    /**
     * Define o valor total do planejamento.
     *
     * @param valorTotal o valor total do planejamento
     */
    public void setValorTotalPlanejamento(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * Obtém a data de início do planejamento.
     *
     * @return a data de início do planejamento
     */
    public LocalDate getData_inicio() {
        return data_inicio;
    }

    /**
     * Define a data de início do planejamento.
     *
     * @param data_inicio a data de início do planejamento
     */
    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * Obtém a data de término do planejamento.
     *
     * @return a data de término do planejamento
     */
    public LocalDate getData_termino() {
        return data_termino;
    }

    /**
     * Define a data de término do planejamento.
     *
     * @param data_termino a data de término do planejamento
     */
    public void setData_termino(LocalDate data_termino) {
        this.data_termino = data_termino;
    }

    /**
     * Obtém o valor inicial do planejamento.
     *
     * @return o valor inicial do planejamento
     */
    public LocalDate getValor_inicial_Planejamento() {
        return valor_inicial;
    }

    /**
     * Define o valor inicial do planejamento.
     *
     * @param valor_inicial o valor inicial do planejamento
     */
    public void setValor_inicial_Planejamento(LocalDate valor_inicial) {
        this.valor_inicial = valor_inicial;
    }
}
