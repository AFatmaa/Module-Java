/**
 * Represents a general payment method.
 */
public class PaymentMethod {
    /**
     * Pays an amount using the default payment method.
     *
     * @param amount the amount to pay
     */
    public void pay(double amount) {
        System.out.println("Paying " + amount);
    }

    /**
     * Pays an amount using the default payment method and a currency.
     * This is an overloaded version of pay().
     *
     * @param amount   the amount to pay
     * @param currency the currency used for the payment
     */
    public void pay(double amount, String currency) {
        System.out.println("Paying " + amount + " " + currency);
    }
}