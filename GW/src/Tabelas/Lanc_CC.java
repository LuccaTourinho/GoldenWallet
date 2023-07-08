package Tabelas;

public class Lanc_CC {
    private Integer id;
    private Integer lanc;
    private Integer cc;

    /**
     * Construtor padrão da classe Lanc_CC.
     */
    public Lanc_CC() {}

    /**
     * Construtor da classe Lanc_CC com os parâmetros fornecidos.
     *
     * @param lanc o ID do lançamento
     * @param cc   o ID do cartão de crédito
     */
    public Lanc_CC(Integer lanc, Integer cc) {
        this.lanc = lanc;
        this.cc = cc;
    }

    /**
     * Construtor da classe Lanc_CC com ID e os demais parâmetros fornecidos.
     *
     * @param id   o ID da associação entre lançamento e cartão de crédito
     * @param lanc o ID do lançamento
     * @param cc   o ID do cartão de crédito
     */
    public Lanc_CC(Integer id, Integer lanc, Integer cc) {
        this.id = id;
        this.lanc = lanc;
        this.cc = cc;
    }

    /**
     * Obtém o ID da associação entre lançamento e cartão de crédito.
     *
     * @return o ID da associação
     */
    public Integer getIdLanc_CC() {
        return id;
    }

    /**
     * Define o ID da associação entre lançamento e cartão de crédito.
     *
     * @param id o ID da associação
     */
    public void setIdLanc_CC(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o ID do lançamento associado.
     *
     * @return o ID do lançamento
     */
    public Integer getLancFK() {
        return lanc;
    }

    /**
     * Define o ID do lançamento associado.
     *
     * @param lanc o ID do lançamento
     */
    public void setLancFK(Integer lanc) {
        this.lanc = lanc;
    }

    /**
     * Obtém o ID do cartão de crédito associado.
     *
     * @return o ID do cartão de crédito
     */
    public Integer getCCFK() {
        return cc;
    }

    /**
     * Define o ID do cartão de crédito associado.
     *
     * @param cc o ID do cartão de crédito
     */
    public void setCCFK(Integer cc) {
        this.cc = cc;
    }
}

