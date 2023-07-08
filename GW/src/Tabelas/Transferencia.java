package Tabelas;

public class Transferencia {
    private Integer id;
    private Integer lanc;
    private Integer conta;

    /**
     * Construtor padrão da classe Transferencia.
     */
    public Transferencia() {}

    /**
     * Construtor da classe Transferencia com lanc e conta.
     *
     * @param lanc  o ID do lançamento associado à transferência
     * @param conta o ID da conta associada à transferência
     */
    public Transferencia(Integer lanc, Integer conta) {
        this.lanc = lanc;
        this.conta = conta;
    }

    /**
     * Construtor da classe Transferencia com ID, lanc e conta.
     *
     * @param id    o ID da transferência
     * @param lanc  o ID do lançamento associado à transferência
     * @param conta o ID da conta associada à transferência
     */
    public Transferencia(Integer id, Integer lanc, Integer conta) {
        this.id = id;
        this.lanc = lanc;
        this.conta = conta;
    }

    /**
     * Obtém o ID da transferência.
     *
     * @return o ID da transferência
     */
    public Integer getIdTransferencia() {
        return id;
    }

    /**
     * Define o ID da transferência.
     *
     * @param id o ID da transferência
     */
    public void setIdTransferencia(Integer id) {
        this.id = id;
    }

    /**
     * Obtém o ID do lançamento associado à transferência.
     *
     * @return o ID do lançamento associado à transferência
     */
    public Integer getLancFK() {
        return lanc;
    }

    /**
     * Define o ID do lançamento associado à transferência.
     *
     * @param lanc o ID do lançamento associado à transferência
     */
    public void setLancFK(Integer lanc) {
        this.lanc = lanc;
    }

    /**
     * Obtém o ID da conta associada à transferência.
     *
     * @return o ID da conta associada à transferência
     */
    public Integer getContaFK() {
        return conta;
    }

    /**
     * Define o ID da conta associada à transferência.
     *
     * @param conta o ID da conta associada à transferência
     */
    public void setContaFK(Integer conta) {
        this.conta = conta;
    }
}

