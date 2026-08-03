import java.time.LocalDate;

/**
 * Represents a single monthly payment in a rental contract.
 */
public class Rental {

    private LocalDate dueDate;
    private double capitalAmount;
    private double interestAmount;
    private boolean paid;

    /**
     * Creates a monthly rental payment.
     *
     * @param dueDate        the date the payment is due
     * @param capitalAmount  the capital part of the payment
     * @param interestAmount the interest part of the payment
     * @param paid           whether the payment has been paid
     */
    public Rental(
            LocalDate dueDate,
            double capitalAmount,
            double interestAmount,
            boolean paid
    ) {
        this.dueDate = dueDate;
        this.capitalAmount = capitalAmount;
        this.interestAmount = interestAmount;
        this.paid = paid;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getCapitalAmount() {
        return capitalAmount;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public boolean isPaid() {
        return paid;
    }
}
