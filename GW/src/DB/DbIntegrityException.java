package DB;

/**
 * Exceção lançada quando ocorre uma falha na integridade do banco de dados.
 */
public class DbIntegrityException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Construtor da classe DbIntegrityException.
     *
     * @param msg mensagem de erro que descreve a causa da exceção
     */
    public DbIntegrityException(String msg) {
        super(msg);
    }
}
