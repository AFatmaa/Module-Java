package exercise3_exceptions;

/**
 * Thrown when a file does not contain valid content.
 */
public class InvalidFileFormatException extends Exception {

    /**
     * Creates an exception with the supplied error message.
     *
     * @param message the reason why the file format is invalid
     */
    public InvalidFileFormatException(String message) {
        super(message);
    }
}