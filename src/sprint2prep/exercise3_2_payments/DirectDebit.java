package sprint2prep.exercise3_2_payments;

/**
 * Represents a direct debit payment method.
 */
public class DirectDebit extends PaymentMethod {
    /**
     * Pays an amount using direct debit.
     * This overrides the pay(double amount) method from PaymentMethod.
     *
     * @param amount the amount to pay
     */
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " by Direct Debit");
    }
}
