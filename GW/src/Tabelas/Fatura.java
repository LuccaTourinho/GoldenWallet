package Tabelas;

import java.time.LocalDate;

public class Fatura {
    private Integer id;
    private Double total_fatura;
    private Double valor_primario;
    private Double valor_secundario;
    private Double pago_primario;
    private Double pago_secundario;
    private LocalDate data_vencimento_fatura;
    private Integer lanc_credito;

    /**
     * Construtor padrão da classe Fatura.
     */
    public Fatura() {}

    /**
     * Construtor da classe Fatura com os parâmetros fornecidos.
     *
     * @param total_fatura           o valor total da fatura
     * @param valor_primario         o valor primário da fatura
     * @param valor_secundario       o valor secundário da fatura
     * @param pago_primario          o valor pago primário da fatura
     * @param pago_secundario        o valor pago secundário da fatura
     * @param data_vencimento_fatura a data de vencimento da fatura
     * @param lanc_credito           o ID do lançamento do cartão de crédito associado à fatura
     */
    public Fatura(Double total_fatura,
                  Double valor_primario,
                  Double valor_secundario,
                  Double pago_primario,
                  Double pago_secundario,
                  LocalDate data_vencimento_fatura,
                  Integer lanc_credito) {
        this.total_fatura = total_fatura;
        this.valor_primario = valor_primario;
        this.valor_secundario = valor_secundario;
        this.pago_primario = pago_primario;
        this.pago_secundario = pago_secundario;
        this.data_vencimento_fatura = data_vencimento_fatura;
        this.lanc_credito = lanc_credito;
    }

    /**
     * Construtor da classe Fatura com ID e os demais parâmetros fornecidos.
     *
     * @param id                     o ID da fatura
     * @param total_fatura           o valor total da fatura
     * @param valor_primario         o valor primário da fatura
     * @param valor_secundario       o valor secundário da fatura
     * @param pago_primario          o valor pago primário da fatura
     * @param pago_secundario        o valor pago secundário da fatura
     * @param data_vencimento_fatura a data de vencimento da fatura
     * @param lanc_credito           o ID do lançamento do cartão de crédito associado à fatura
     */
    public Fatura(Integer id,
                  Double total_fatura,
                  Double valor_primario,
                  Double valor_secundario,
                  Double pago_primario,
                  Double pago_secundario,
                  LocalDate data_vencimento_fatura,
                  Integer lanc_credito) {
        this.id = id;
        this.total_fatura = total_fatura;
        this.valor_primario = valor_primario;
        this.valor_secundario = valor_secundario;
        this.pago_primario = pago_primario;
        this.pago_secundario = pago_secundario;
        this.data_vencimento_fatura = data_vencimento_fatura;
        this.lanc_credito = lanc_credito;
    }

    /**
     * Obtém o ID da fatura.
     *
     * @return o ID da fatura
     */
    public Integer getIdFatura() {
        return id;
    }

    /**
     * Define o ID da fatura.
     *
     * @param id o ID da fatura
     */
    public void setIdFatura(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o valor total da fatura.
     *
     * @return o valor total da fatura
     */
    public Double getTotal_fatura() {
        return total_fatura;
    }

    /**
     * Define o valor total da fatura.
     *
     * @param total_fatura o valor total da fatura
     */
    public void setTotal_fatura(Double total_fatura) {
        this.total_fatura = total_fatura;
    }

    /**
     * Obtém o valor primário da fatura.
     *
     * @return o valor primário da fatura
     */
    public Double getValor_primario() {
        return valor_primario;
    }

    /**
     * Define o valor primário da fatura.
     *
     * @param valor_primario o valor primário da fatura
     */
    public void setValor_primario(Double valor_primario) {
        this.valor_primario = valor_primario;
    }

    /**
     * Obtém o valor secundário da fatura.
     *
     * @return o valor secundário da fatura
     */
    public Double getValor_secundario() {
        return valor_secundario;
    }

    /**
     * Define o valor secundário da fatura.
     *
     * @param valor_secundario o valor secundário da fatura
     */
    public void setValor_secundario(Double valor_secundario) {
        this.valor_secundario = valor_secundario;
    }

    /**
     * Obtém o valor pago primário da fatura.
     *
     * @return o valor pago primário da fatura
     */
    public Double getPago_primario() {
        return pago_primario;
    }

    /**
     * Define o valor pago primário da fatura.
     *
     * @param pago_primario o valor pago primário da fatura
     */
    public void setPago_primario(Double pago_primario) {
        this.pago_primario = pago_primario;
    }

    /**
     * Obtém o valor pago secundário da fatura.
     *
     * @return o valor pago secundário da fatura
     */
    public Double getPago_secundario() {
        return pago_secundario;
    }

    /**
     * Define o valor pago secundário da fatura.
     *
     * @param pago_secundario o valor pago secundário da fatura
     */
    public void setPago_secundario(Double pago_secundario) {
        this.pago_secundario = pago_secundario;
    }

    /**
     * Obtém a data de vencimento da fatura.
     *
     * @return a data de vencimento da fatura
     */
    public LocalDate getData_vencimento_fatura() {
        return data_vencimento_fatura;
    }

    /**
     * Define a data de vencimento da fatura.
     *
     * @param data_vencimento_fatura a data de vencimento da fatura
     */
    public void setData_vencimento_fatura(LocalDate data_vencimento_fatura) {
        this.data_vencimento_fatura = data_vencimento_fatura;
    }

    /**
     * Obtém o ID do lançamento do cartão de crédito associado à fatura.
     *
     * @return o ID do lançamento do cartão de crédito
     */
    public Integer getLanc_creditoFK() {
        return lanc_credito;
    }

    /**
     * Define o ID do lançamento do cartão de crédito associado à fatura.
     *
     * @param lanc_credito o ID do lançamento do cartão de crédito
     */
    public void setLanc_creditoFK(Integer lanc_credito) {
        this.lanc_credito = lanc_credito;
    }
}
