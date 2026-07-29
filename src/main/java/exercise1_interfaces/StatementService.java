package exercise1_interfaces;

/**
 * Creates and sends different types of monthly bank statements.
 */
public class StatementService {

    private final StatementDeliveryService statementDeliveryService;

    /**
     * Creates a statement service using the supplied delivery service.
     *
     * @param statementDeliveryService the service used to deliver statements
     */
    public StatementService(StatementDeliveryService statementDeliveryService) {
        this.statementDeliveryService = statementDeliveryService;
    }

    /**
     * Creates and sends a statement containing all transactions.
     *
     * @param statementSender the sender used to deliver the statement
     */
    public void createAndSendAllTransactionsMonthlyStatement(StatementSender statementSender) {
        Statement statement = new AllTransactionsMonthlyStatement();

        statementDeliveryService.deliverStatement(statement, statementSender);
    }

    /**
     * Creates and sends a statement containing only outgoing transactions.
     *
     * @param statementSender the sender used to deliver the statement
     */
    public void createAndSendOutgoingTransactionsMonthlyStatement(StatementSender statementSender) {
        Statement statement = new OutgoingTransactionsMonthlyStatement();

        statementDeliveryService.deliverStatement(statement, statementSender);
    }
}
