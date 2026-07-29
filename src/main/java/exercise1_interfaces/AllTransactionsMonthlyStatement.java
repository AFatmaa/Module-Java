package exercise1_interfaces;

/**
 * Represents a monthly bank statement containing
 * all incoming and outgoing transactions.
 */
public class AllTransactionsMonthlyStatement implements Statement {

    @Override
    public String generateContent() {
        return "Monthly statement containing all incoming and outgoing transactions.";
    }
}
