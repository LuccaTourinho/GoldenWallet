package Tabelas;

public class Despesa {
    private Integer id;
    private Integer lanc;
    private Integer catDesp;

    /**
     * Construtor padrão da classe Despesa.
     */
    public Despesa() {}

    /**
     * Construtor da classe Despesa com lanc e catDesp.
     *
     * @param lanc     o ID do lançamento associado à despesa
     * @param catDesp  o ID da categoria de despesa associada à despesa
     */
    public Despesa(Integer lanc, Integer catDesp) {
        this.lanc = lanc;
        this.catDesp = catDesp;
    }

    /**
     * Construtor da classe Despesa com ID, lanc e catDesp.
     *
     * @param id       o ID da despesa
     * @param lanc     o ID do lançamento associado à despesa
     * @param catDesp  o ID da categoria de despesa associada à despesa
     */
    public Despesa(Integer id, Integer lanc, Integer catDesp) {
        this.id = id;
        this.lanc = lanc;
        this.catDesp = catDesp;
    }

    /**
     * Obtém o ID da despesa.
     *
     * @return o ID da despesa
     */
    public Integer getIdDespesa() {
        return id;
    }

    /**
     * Define o ID da despesa.
     *
     * @param id o ID da despesa
     */
    public void setIdDespesa(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o ID do lançamento associado à despesa.
     *
     * @return o ID do lançamento associado à despesa
     */
    public Integer getLancFK() {
        return lanc;
    }

    /**
     * Define o ID do lançamento associado à despesa.
     *
     * @param lanc o ID do lançamento associado à despesa
     */
    public void setLancFK(Integer lanc) {
        this.lanc = lanc;
    }

    /**
     * Obtém o ID da categoria de despesa associada à despesa.
     *
     * @return o ID da categoria de despesa associada à despesa
     */
    public Integer getCatDespFK() {
        return catDesp;
    }

    /**
     * Define o ID da categoria de despesa associada à despesa.
     *
     * @param catDesp o ID da categoria de despesa associada à despesa
     */
    public void setCatDespFK(Integer catDesp) {
        this.catDesp = catDesp;
    }
}
