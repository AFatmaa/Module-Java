/**
 * Runs composition vs inheritance exercise.
 */
public class CheckoutDemo {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PaymentMethod();
        Checkout checkout = new Checkout(paymentMethod);

        checkout.processPayment(50);

        checkout.updatePaymentMethod(new DirectDebit());
        checkout.processPayment(75);

        checkout.updatePaymentMethod(new CardPayment());
        checkout.processPayment(100);

    }
}
