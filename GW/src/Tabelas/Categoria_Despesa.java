package Tabelas;

public class Categoria_Despesa {
    private Integer id;
    private String categoriaDespesa;
    private String subcategoriaDespesa;

    /**
     * Construtor padrão da classe Categoria_Despesa.
     */
    public Categoria_Despesa() {
    }

    /**
     * Construtor da classe Categoria_Despesa com categoria e subcategoria.
     *
     * @param categoriaDespesa   a categoria da despesa
     * @param subcategoriaDespesa a subcategoria da despesa
     */
    public Categoria_Despesa(String categoriaDespesa, String subcategoriaDespesa) {
        this.categoriaDespesa = categoriaDespesa;
        this.subcategoriaDespesa = subcategoriaDespesa;
    }

    /**
     * Construtor da classe Categoria_Despesa com id, categoria e subcategoria.
     *
     * @param id                  o ID da categoria de despesa
     * @param categoriaDespesa   a categoria da despesa
     * @param subcategoriaDespesa a subcategoria da despesa
     */
    public Categoria_Despesa(Integer id, String categoriaDespesa, String subcategoriaDespesa) {
        this.id = id;
        this.categoriaDespesa = categoriaDespesa;
        this.subcategoriaDespesa = subcategoriaDespesa;
    }

    /**
     * Obtém o ID da categoria de despesa.
     *
     * @return o ID da categoria de despesa
     */
    public Integer getIdCatDespesa() {
        return id;
    }

    /**
     * Define o ID da categoria de despesa.
     *
     * @param id o ID da categoria de despesa
     */
    public void setIdCatDespesa(Integer id) {
        this.id = id;
    }

    /**
     * Obtém a categoria da despesa.
     *
     * @return a categoria da despesa
     */
    public String getCategoriaDespesa() {
        return categoriaDespesa;
    }

    /**
     * Define a categoria da despesa.
     *
     * @param categoriaDespesa a categoria da despesa
     */
    public void setCategoriaDespesa(String categoriaDespesa) {
        this.categoriaDespesa = categoriaDespesa;
    }

    /**
     * Obtém a subcategoria da despesa.
     *
     * @return a subcategoria da despesa
     */
    public String getSubcategoriaDespesa() {
        return subcategoriaDespesa;
    }

    /**
     * Define a subcategoria da despesa.
     *
     * @param subcategoriaDespesa a subcategoria da despesa
     */
    public void setSubcategoriaDespesa(String subcategoriaDespesa) {
        this.subcategoriaDespesa = subcategoriaDespesa;
    }
}

