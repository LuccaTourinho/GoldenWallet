package Tabelas;

public class Moeda {
    private Integer id;
    private Integer pais;
    private String sigla;
    private String simbolo;

    /**
     * Construtor padrão da classe Moeda.
     */
    public Moeda() {}

    /**
     * Construtor da classe Moeda com país, sigla e símbolo da moeda.
     *
     * @param pais    o ID do país da moeda
     * @param sigla   a sigla da moeda
     * @param simbolo o símbolo da moeda
     */
    public Moeda(Integer pais, String sigla, String simbolo) {
        this.pais = pais;
        this.sigla = sigla;
        this.simbolo = simbolo;
    }

    /**
     * Construtor da classe Moeda com ID, país, sigla e símbolo da moeda.
     *
     * @param id      o ID da moeda
     * @param pais    o ID do país da moeda
     * @param sigla   a sigla da moeda
     * @param simbolo o símbolo da moeda
     */
    public Moeda(Integer id, Integer pais, String sigla, String simbolo) {
        this.id = id;
        this.pais = pais;
        this.sigla = sigla;
        this.simbolo = simbolo;
    }

    /**
     * Obtém o ID da moeda.
     *
     * @return o ID da moeda
     */
    public Integer getIdMoeda() {
        return id;
    }

    /**
     * Define o ID da moeda.
     *
     * @param id o ID da moeda
     */
    public void setIdMoeda(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o ID do país da moeda.
     *
     * @return o ID do país da moeda
     */
    public Integer getPaisMoedaFK() {
        return pais;
    }

    /**
     * Define o ID do país da moeda.
     *
     * @param pais o ID do país da moeda
     */
    public void setPaisMoedaFK(Integer pais) {
        this.pais = pais;
    }

    /**
     * Obtém a sigla da moeda.
     *
     * @return a sigla da moeda
     */
    public String getSiglaMoeda() {
        return sigla;
    }

    /**
     * Define a sigla da moeda.
     *
     * @param sigla a sigla da moeda
     */
    public void setSiglaMoeda(String sigla) {
        this.sigla = sigla;
    }

    /**
     * Obtém o símbolo da moeda.
     *
     * @return o símbolo da moeda
     */
    public String getSimboloMoeda() {
        return simbolo;
    }

    /**
     * Define o símbolo da moeda.
     *
     * @param simbolo o símbolo da moeda
     */
    public void setSimboloMoeda(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return "Moeda [id=" + id + ", idpm=" + pais + ", sigla=" + sigla + ", simbolo=" + simbolo + "]";
    }
}

