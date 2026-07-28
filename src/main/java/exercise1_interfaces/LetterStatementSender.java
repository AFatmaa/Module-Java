package exercise1_interfaces;

/**
 * Sends bank statements as physical letters.
 */
public class LetterStatementSender implements StatementSender {

    @Override
    public void sendStatement(String statementContent) {
        System.out.println("Statement sent successfully by letter: " + statementContent);
    }
}