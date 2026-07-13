/**
 * Represents a checkout process that uses a payment method.
 */
public class Checkout {
    private PaymentMethod paymentMethod;

    /**
     * Creates a checkout with a payment method.
     *
     * @param paymentMethod the payment method used by the checkout
     */
    public Checkout(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Processes a payment using the current payment method.
     *
     * @param amount the amount the pay
     */
    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }

    /**
     * Updates the payment method used by the checkout.
     *
     * @param paymentMethod the new payment method
     */
    public void updatePaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
