package raphdine.sml.api.exception;

/**
 *
 * @author Raphiki
 */
public class NotPossibleException extends Exception {

    /**
     * Creates a new instance of <code>NotPossibleException</code> without
     * detail message.
     */
    public NotPossibleException() {
    }

    /**
     * Constructs an instance of <code>NotPossibleException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotPossibleException(String msg) {
        super(msg);
    }
}
