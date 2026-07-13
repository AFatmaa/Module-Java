package sprint2prep.exercise3_2_payments;

/**
 * Runs the overloading and overriding exercise.
 */
public class PaymentDemo {
    public static void main(String[] args) {
        System.out.println("PaymentMethod example:");

        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.pay(50);
        paymentMethod.pay(50, "GBP");

        System.out.println();
        System.out.println("DirectDebit example:");

        DirectDebit directDebit = new DirectDebit();
        directDebit.pay(75);
        directDebit.pay(75, "GBP");

        System.out.println();
        System.out.println("Polymorphic example:");

        PaymentMethod payment = new DirectDebit();
        payment.pay(100);
        payment.pay(100, "GBP");
    }
}
