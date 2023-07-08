package Tabelas;

import java.time.LocalDate;

public class Log {
    private Integer id;
    private Integer conta;
    private Double acima_despesa;
    private LocalDate data_log;

    public Log() {}

    /**
     * Cria um objeto Log com os parâmetros especificados.
     * @param conta O ID da conta associada ao log.
     * @param acima_despesa O valor que excede a despesa limite.
     * @param data_log A data do registro do log.
     */
    public Log(Integer conta, Double acima_despesa, LocalDate data_log) {
        this.conta = conta;
        this.acima_despesa = acima_despesa;
        this.data_log = data_log;
    }

    /**
     * Cria um objeto Log com os parâmetros especificados, incluindo o ID.
     * @param id O ID do log.
     * @param conta O ID da conta associada ao log.
     * @param acima_despesa O valor que excede a despesa limite.
     * @param data_log A data do registro do log.
     */
    public Log(Integer id, Integer conta, Double acima_despesa, LocalDate data_log) {
        this.id = id;
        this.conta = conta;
        this.acima_despesa = acima_despesa;
        this.data_log = data_log;
    }

    /**
     * Obtém o ID do log.
     * @return O ID do log.
     */
    public Integer getIdLOG() {
        return id;
    }

    /**
     * Define o ID do log.
     * @param id O ID do log.
     */
    public void setIdLOG(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o ID da conta associada ao log.
     * @return O ID da conta associada ao log.
     */
    public Integer getContaFK() {
        return conta;
    }

    /**
     * Define o ID da conta associada ao log.
     * @param conta O ID da conta associada ao log.
     */
    public void setContaFK(Integer conta) {
        this.conta = conta;
    }

    /**
     * Obtém o valor que excede a despesa limite.
     * @return O valor que excede a despesa limite.
     */
    public Double getAcima_despesa() {
        return acima_despesa;
    }

    /**
     * Define o valor que excede a despesa limite.
     * @param acima_despesa O valor que excede a despesa limite.
     */
    public void setAcima_despesa(Double acima_despesa) {
        this.acima_despesa = acima_despesa;
    }

    /**
     * Obtém a data do registro do log.
     * @return A data do registro do log.
     */
    public LocalDate getData_log() {
        return data_log;
    }

    /**
     * Define a data do registro do log.
     * @param data_log A data do registro do log.
     */
    public void setData_log(LocalDate data_log) {
        this.data_log = data_log;
    }
}

