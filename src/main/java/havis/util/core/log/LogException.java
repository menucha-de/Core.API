package havis.util.core.log;

/**
 * This exception subclass represents errors that may occurs within the logging
 * manager bundle.
 * 
 */
public class LogException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Creates an instance of this class
	 */
	public LogException() {
		super();
	}

	/**
	 * Creates an instance of this class.
	 * 
	 * @param message
	 *            the detail message.
	 */
	public LogException(String message) {
		super(message);
	}

	/**
	 * Creates an instance of this class.
	 * 
	 * @param message
	 *            the detail message.
	 * @param cause
	 *            the cause. (A null value is permitted, and indicates that the
	 *            cause is nonexistent or unknown.)
	 * 
	 */
	public LogException(String message, Throwable cause) {
		super(message, cause);
	}
}
