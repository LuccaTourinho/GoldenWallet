package Tabelas;

public class Aporte_Plan {
    private Integer id;
    private Integer lanc;
    private Integer plan;

    /**
     * Construtor padrão da classe Aporte_Plan.
     */
    public Aporte_Plan() {}

    /**
     * Construtor da classe Aporte_Plan com lanc e plan.
     *
     * @param lanc o ID do lançamento associado ao aporte
     * @param plan o ID do planejamento associado ao aporte
     */
    public Aporte_Plan(Integer lanc, Integer plan) {
        this.lanc = lanc;
        this.plan = plan;
    }

    /**
     * Construtor da classe Aporte_Plan com ID, lanc e plan.
     *
     * @param id   o ID do aporte
     * @param lanc o ID do lançamento associado ao aporte
     * @param plan o ID do planejamento associado ao aporte
     */
    public Aporte_Plan(Integer id, Integer lanc, Integer plan) {
        this.id = id;
        this.lanc = lanc;
        this.plan = plan;
    }

    /**
     * Obtém o ID do aporte.
     *
     * @return o ID do aporte
     */
    public Integer getIdApor() {
        return id;
    }

    /**
     * Define o ID do aporte.
     *
     * @param id o ID do aporte
     */
    public void setIdApor(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o ID do lançamento associado ao aporte.
     *
     * @return o ID do lançamento associado ao aporte
     */
    public Integer getLancFK() {
        return lanc;
    }

    /**
     * Define o ID do lançamento associado ao aporte.
     *
     * @param lanc o ID do lançamento associado ao aporte
     */
    public void setLancFK(Integer lanc) {
        this.lanc = lanc;
    }

    /**
     * Obtém o ID do planejamento associado ao aporte.
     *
     * @return o ID do planejamento associado ao aporte
     */
    public Integer getPlanFK() {
        return plan;
    }

    /**
     * Define o ID do planejamento associado ao aporte.
     *
     * @param plan o ID do planejamento associado ao aporte
     */
    public void setPlanFK(Integer plan) {
        this.plan = plan;
    }
}

