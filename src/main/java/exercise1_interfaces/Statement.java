package exercise1_interfaces;

/**
 * Defines a contract for creating a bank statement.
 */
public interface Statement {

    /**
     * Creates the content of the bank statement.
     *
     * @return the formatted statement content
     */
    String generateContent();
}
