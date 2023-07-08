package Tabelas;

public class Categoria_Receita {
    private Integer id;
    private String categoriaReceita;
    private String subCategoriaReceita;

    /**
     * Construtor padrão da classe Categoria_Receita.
     */
    public Categoria_Receita() {
    }

    /**
     * Construtor da classe Categoria_Receita com categoria e subcategoria.
     *
     * @param categoria   a categoria da receita
     * @param subCategoria a subcategoria da receita
     */
    public Categoria_Receita(String categoria, String subCategoria) {
        this.categoriaReceita = categoria;
        this.subCategoriaReceita = subCategoria;
    }

    /**
     * Construtor da classe Categoria_Receita com id, categoria e subcategoria.
     *
     * @param id           o ID da categoria de receita
     * @param categoria   a categoria da receita
     * @param subCategoria a subcategoria da receita
     */
    public Categoria_Receita(Integer id, String categoria, String subCategoria) {
        this.id = id;
        this.categoriaReceita = categoria;
        this.subCategoriaReceita = subCategoria;
    }

    /**
     * Obtém o ID da categoria de receita.
     *
     * @return o ID da categoria de receita
     */
    public Integer getIdCatReceita() {
        return id;
    }

    /**
     * Define o ID da categoria de receita.
     *
     * @param id o ID da categoria de receita
     */
    public void setIdCatReceita(Integer id) {
        this.id = id;
    }

    /**
     * Obtém a categoria da receita.
     *
     * @return a categoria da receita
     */
    public String getCategoriaReceita() {
        return categoriaReceita;
    }

    /**
     * Define a categoria da receita.
     *
     * @param categoria a categoria da receita
     */
    public void setCategoriaReceita(String categoria) {
        this.categoriaReceita = categoria;
    }

    /**
     * Obtém a subcategoria da receita.
     *
     * @return a subcategoria da receita
     */
    public String getSubCategoria() {
        return subCategoriaReceita;
    }

    /**
     * Define a subcategoria da receita.
     *
     * @param subCategoria a subcategoria da receita
     */
    public void setSubCategoria(String subCategoria) {
        this.subCategoriaReceita = subCategoria;
    }
}

