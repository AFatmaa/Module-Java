/**
 * Represents a card payment method.
 */
public class CardPayment extends PaymentMethod {
    /**
     * Pays an amount using card payment.
     *
     * @param amount the amount to pay
     */
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " by Card");
    }
}
