package Tabelas;

public class Receita {
    private Integer id;
    private Integer lanc;
    private Integer catReceita;

    /**
     * Construtor padrão da classe Receita.
     */
    public Receita() {}

    /**
     * Construtor da classe Receita com lanc e catReceita.
     *
     * @param lanc       o ID do lançamento associado à receita
     * @param catReceita o ID da categoria de receita associada à receita
     */
    public Receita(Integer lanc, Integer catReceita) {
        this.lanc = lanc;
        this.catReceita = catReceita;
    }

    /**
     * Construtor da classe Receita com ID, lanc e catReceita.
     *
     * @param id         o ID da receita
     * @param lanc       o ID do lançamento associado à receita
     * @param catReceita o ID da categoria de receita associada à receita
     */
    public Receita(Integer id, Integer lanc, Integer catReceita) {
        this.id = id;
        this.lanc = lanc;
        this.catReceita = catReceita;
    }

    /**
     * Obtém o ID da receita.
     *
     * @return o ID da receita
     */
    public Integer getIdReceita() {
        return id;
    }

    /**
     * Define o ID da receita.
     *
     * @param id o ID da receita
     */
    public void setIdReceita(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o ID do lançamento associado à receita.
     *
     * @return o ID do lançamento associado à receita
     */
    public Integer getLancFK() {
        return lanc;
    }

    /**
     * Define o ID do lançamento associado à receita.
     *
     * @param lanc o ID do lançamento associado à receita
     */
    public void setLancFK(Integer lanc) {
        this.lanc = lanc;
    }

    /**
     * Obtém o ID da categoria de receita associada à receita.
     *
     * @return o ID da categoria de receita associada à receita
     */
    public Integer getCatReceitaFK() {
        return catReceita;
    }

    /**
     * Define o ID da categoria de receita associada à receita.
     *
     * @param catReceita o ID da categoria de receita associada à receita
     */
    public void setCatReceitaFK(Integer catReceita) {
        this.catReceita = catReceita;
    }
}

