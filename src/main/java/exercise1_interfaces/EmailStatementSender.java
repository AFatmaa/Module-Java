package exercise1_interfaces;

/**
 * Sends bank statements by email.
 */
public class EmailStatementSender implements StatementSender {

    @Override
    public void sendStatement(String statementContent) {
        System.out.println("Statement sent successfully by email: " + statementContent);
    }
}