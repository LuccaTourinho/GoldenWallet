package DB;

/**
 * Exceção lançada para representar erros genéricos relacionados a operações do banco de dados.
 */
public class DbException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Construtor da classe DbException.
     *
     * @param msg mensagem de erro que descreve a causa da exceção
     */
    public DbException(String msg) {
        super(msg);
    }
}

