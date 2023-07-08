package Tabelas;

public class Usuario {
    private Integer id;
    private String nome;
    private String senha;

    /**
     * Construtor padrão da classe Usuario.
     */
    public Usuario() {
    }

    /**
     * Construtor da classe Usuario com nome e senha.
     *
     * @param nome  o nome do usuário
     * @param senha a senha do usuário
     */
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    /**
     * Construtor da classe Usuario com id, nome e senha.
     *
     * @param id    o ID do usuário
     * @param nome  o nome do usuário
     * @param senha a senha do usuário
     */
    public Usuario(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    /**
     * Obtém o ID do usuário.
     *
     * @return o ID do usuário
     */
    public Integer getIdUsuario() {
        return id;
    }

    /**
     * Obtém o nome do usuário.
     *
     * @return o nome do usuário
     */
    public String getNomeUsuario() {
        return nome;
    }

    /**
     * Obtém a senha do usuário.
     *
     * @return a senha do usuário
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o ID do usuário.
     *
     * @param id o ID do usuário
     */
    public void setIdUsuario(Integer id) {
        this.id = id;
    }

    /**
     * Define o nome do usuário.
     *
     * @param nome o nome do usuário
     */
    public void setNomeUsuario(String nome) {
        this.nome = nome;
    }

    /**
     * Define a senha do usuário.
     *
     * @param senha a senha do usuário
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome" + nome + ", senha=" + senha +"]";
    }
}

