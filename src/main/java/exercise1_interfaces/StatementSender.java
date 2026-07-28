package exercise1_interfaces;

/**
 * Defines a contract for sending bank statements.
 */
public interface StatementSender {

    /**
     * Sends the given bank statement content.
     *
     * @param statementContent the bank statement content to send
     */
    void sendStatement(String statementContent);
}