package Tabelas;

public class Banco {
    private Integer id;
    private String nome;
    private String codigo;
    private String sigla;

    /**
     * Construtor padrão da classe Banco.
     */
    public Banco() {
    }

    /**
     * Construtor da classe Banco.
     *
     * @param nome   o nome do banco
     * @param codigo o código do banco
     * @param sigla  a sigla do banco
     */
    public Banco(String nome, String codigo, String sigla) {
        this.nome = nome;
        this.codigo = codigo;
        this.sigla = sigla;
    }

    /**
     * Construtor da classe Banco.
     *
     * @param id     o ID do banco
     * @param nome   o nome do banco
     * @param codigo o código do banco
     * @param sigla  a sigla do banco
     */
    public Banco(Integer id, String nome, String codigo, String sigla) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
        this.sigla = sigla;
    }

    /**
     * Obtém o ID do banco.
     *
     * @return o ID do banco
     */
    public Integer getIdBanco() {
        return id;
    }

    /**
     * Define o ID do banco.
     *
     * @param id o ID do banco
     */
    public void setIdBanco(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o nome do banco.
     *
     * @return o nome do banco
     */
    public String getNomeBanco() {
        return nome;
    }

    /**
     * Define o nome do banco.
     *
     * @param nome o nome do banco
     */
    public void setNomeBanco(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o código do banco.
     *
     * @return o código do banco
     */
    public String getCodigoBanco() {
        return codigo;
    }

    /**
     * Define o código do banco.
     *
     * @param codigo o código do banco
     */
    public void setCodigoBanco(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtém a sigla do banco.
     *
     * @return a sigla do banco
     */
    public String getSiglaBanco() {
        return sigla;
    }

    /**
     * Define a sigla do banco.
     *
     * @param sigla a sigla do banco
     */
    public void setSiglaBanco(String sigla) {
        this.sigla = sigla;
    }
}

