package exercise1_interfaces;

/**
 * Represent a monthly bank statement containing
 * only outgoing transactions.
 */
public class OutgoingTransactionsMonthlyStatement implements Statement {

    @Override
    public String generateContent() {
        return "Monthly statement containing only outgoing transactions.";
    }
}
