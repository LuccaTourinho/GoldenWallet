package Tabelas;

public class Conta {
    private Integer id;
    private String nome;
    private Double valor_inicial;
    private Integer banco;
    private Integer moeda;
    private Integer usuario;

    /**
     * Construtor padrão da classe Conta.
     */
    public Conta() {}

    /**
     * Construtor da classe Conta com nome, valor inicial, banco, moeda e usuário.
     *
     * @param nome           o nome da conta
     * @param valor_inicial  o valor inicial da conta
     * @param banco          o ID do banco associado à conta
     * @param moeda          o ID da moeda associada à conta
     * @param usuario        o ID do usuário associado à conta
     */
    public Conta(String nome, Double valor_inicial, Integer banco, Integer moeda, Integer usuario) {
        this.nome = nome;
        this.valor_inicial = valor_inicial;
        this.banco = banco;
        this.moeda = moeda;
        this.usuario = usuario;
    }

    /**
     * Construtor da classe Conta com ID, nome, valor inicial, banco, moeda e usuário.
     *
     * @param id             o ID da conta
     * @param nome           o nome da conta
     * @param valor_inicial  o valor inicial da conta
     * @param banco          o ID do banco associado à conta
     * @param moeda          o ID da moeda associada à conta
     * @param usuario        o ID do usuário associado à conta
     */
    public Conta(Integer id, String nome, Double valor_inicial, Integer banco, Integer moeda, Integer usuario) {
        this.id = id;
        this.nome = nome;
        this.valor_inicial = valor_inicial;
        this.banco = banco;
        this.moeda = moeda;
        this.usuario = usuario;
    }

    /**
     * Obtém o ID da conta.
     *
     * @return o ID da conta
     */
    public Integer getIdConta() {
        return id;
    }

    /**
     * Define o ID da conta.
     *
     * @param id o ID da conta
     */
    public void setIdConta(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o nome da conta.
     *
     * @return o nome da conta
     */
    public String getNomeConta() {
        return nome;
    }

    /**
     * Define o nome da conta.
     *
     * @param nome o nome da conta
     */
    public void setNomeConta(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o valor inicial da conta.
     *
     * @return o valor inicial da conta
     */
    public Double getValor_inicialConta() {
        return valor_inicial;
    }

    /**
     * Define o valor inicial da conta.
     *
     * @param valor_inicial o valor inicial da conta
     */
    public void setValor_inicialConta(Double valor_inicial) {
        this.valor_inicial = valor_inicial;
    }

    /**
     * Obtém o ID do banco associado à conta.
     *
     * @return o ID do banco associado à conta
     */
    public Integer getBancoFK() {
        return banco;
    }

    /**
     * Define o ID do banco associado à conta.
     *
     * @param banco o ID do banco associado à conta
     */
    public void setBancoFK(Integer banco) {
        this.banco = banco;
    }

    /**
     * Obtém o ID da moeda associada à conta.
     *
     * @return o ID da moeda associada à conta
     */
    public Integer getMoedaFK() {
        return moeda;
    }

    /**
     * Define o ID da moeda associada à conta.
     *
     * @param moeda o ID da moeda associada à conta
     */
    public void setMoedaFK(Integer moeda) {
        this.moeda = moeda;
    }

    /**
     * Obtém o ID do usuário associado à conta.
     *
     * @return o ID do usuário associado à conta
     */
    public Integer getUsuarioFK() {
        return usuario;
    }

    /**
     * Define o ID do usuário associado à conta.
     *
     * @param usuario o ID do usuário associado à conta
     */
    public void setUsuarioFK(Integer usuario) {
        this.usuario = usuario;
    }
}

