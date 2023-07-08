package Tabelas;

public class Limites_Gastos {
    private Integer id;
    private Integer conta;
    private Integer despesa;
    private Double limite_mensal;

    public Limites_Gastos() {}

    /**
     * Cria um objeto Limites_Gastos com os parâmetros especificados.
     * @param conta O ID da conta associada ao limite de gastos.
     * @param despesa O ID da categoria de despesa associada ao limite de gastos.
     * @param limite_mensal O limite de gastos mensal.
     */
    public Limites_Gastos(Integer conta, Integer despesa, Double limite_mensal) {
        this.conta = conta;
        this.despesa = despesa;
        this.limite_mensal = limite_mensal;
    }

    /**
     * Cria um objeto Limites_Gastos com os parâmetros especificados, incluindo o ID.
     * @param id O ID do limite de gastos.
     * @param conta O ID da conta associada ao limite de gastos.
     * @param despesa O ID da categoria de despesa associada ao limite de gastos.
     * @param limite_mensal O limite de gastos mensal.
     */
    public Limites_Gastos(Integer id, Integer conta, Integer despesa, Double limite_mensal) {
        this.id = id;
        this.conta = conta;
        this.despesa = despesa;
        this.limite_mensal = limite_mensal;
    }

    /**
     * Obtém o ID do limite de gastos.
     * @return O ID do limite de gastos.
     */
    public Integer getIdLM() {
        return id;
    }

    /**
     * Define o ID do limite de gastos.
     * @param id O ID do limite de gastos.
     */
    public void setIdLM(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o ID da conta associada ao limite de gastos.
     * @return O ID da conta associada ao limite de gastos.
     */
    public Integer getContaFK() {
        return conta;
    }

    /**
     * Define o ID da conta associada ao limite de gastos.
     * @param conta O ID da conta associada ao limite de gastos.
     */
    public void setContaFK(Integer conta) {
        this.conta = conta;
    }

    /**
     * Obtém o ID da categoria de despesa associada ao limite de gastos.
     * @return O ID da categoria de despesa associada ao limite de gastos.
     */
    public Integer getDespesaFK() {
        return despesa;
    }

    /**
     * Define o ID da categoria de despesa associada ao limite de gastos.
     * @param despesa O ID da categoria de despesa associada ao limite de gastos.
     */
    public void setDespesaFK(Integer despesa) {
        this.despesa = despesa;
    }

    /**
     * Obtém o limite de gastos mensal.
     * @return O limite de gastos mensal.
     */
    public Double getLimite_mensal() {
        return limite_mensal;
    }

    /**
     * Define o limite de gastos mensal.
     * @param limite_mensal O limite de gastos mensal.
     */
    public void setLimite_mensal(Double limite_mensal) {
        this.limite_mensal = limite_mensal;
    }
}

