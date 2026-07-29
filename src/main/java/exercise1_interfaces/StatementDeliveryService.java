package exercise1_interfaces;

/**
 * Delivers bank statements using a chosen statement sender.
 */
public class StatementDeliveryService {

    /**
     * Delivers statement content using the supplied sender.
     *
     * @param statementContent the statement content to send
     * @param statementSender  the sender used to deliver the statement
     */
    public void deliverStatement(String statementContent, StatementSender statementSender) {
        statementSender.sendStatement(statementContent);
    }

    /**
     * Delivers a statement using the supplied sender.
     *
     * @param statement       the statement to send
     * @param statementSender the sender used to deliver the statement
     */
    public void deliverStatement(Statement statement, StatementSender statementSender) {
        statementSender.sendStatement(statement);
    }
}