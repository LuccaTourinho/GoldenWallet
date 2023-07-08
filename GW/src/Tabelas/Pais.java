package Tabelas;

public class Pais {
    private Integer id;
    private String nome;
    private String sigla;

    /**
     * Construtor padrão da classe Pais.
     */
    public Pais() {
    }

    /**
     * Construtor da classe Pais com nome e sigla.
     *
     * @param nome  o nome do país
     * @param sigla a sigla do país
     */
    public Pais(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    /**
     * Construtor da classe Pais com id, nome e sigla.
     *
     * @param id    o ID do país
     * @param nome  o nome do país
     * @param sigla a sigla do país
     */
    public Pais(Integer id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    /**
     * Obtém o ID do país.
     *
     * @return o ID do país
     */
    public Integer getIdPais() {
        return id;
    }

    /**
     * Define o ID do país.
     *
     * @param id o ID do país
     */
    public void setIdPais(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o nome do país.
     *
     * @return o nome do país
     */
    public String getNomePais() {
        return nome;
    }

    /**
     * Define o nome do país.
     *
     * @param nome o nome do país
     */
    public void setNomePais(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a sigla do país.
     *
     * @return a sigla do país
     */
    public String getSiglaPais() {
        return sigla;
    }

    /**
     * Define a sigla do país.
     *
     * @param sigla a sigla do país
     */
    public void setSiglaPais(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Pias [id=" + id + ", nome=" + nome + ", sigla=" + sigla+"]";
    }
}

