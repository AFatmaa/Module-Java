import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Represents a summary of a customer's rental contract and payments.
 */
public class RentalSummary {

    private String customerName;
    private int customerAge;
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
    private List<Rental> rentals;
    private Optional<Rental> nextDueRental;
    private double totalCapitalAmount;
    private double totalInterestAmount;
    private long outstandingRentalCount;

    /**
     * Creates a rental summary.
     *
     * @param customerName           the name of the customer
     * @param customerAge            the age of the customer
     * @param contractStartDate      the start date of the contract
     * @param contractEndDate        the end date of the contract
     * @param rentals                the monthly rental payments
     * @param nextDueRental          the next unpaid rental, if one exists
     * @param totalCapitalAmount     the total capital amount
     * @param totalInterestAmount    the total interest amount
     * @param outstandingRentalCount the number of unpaid rentals
     */
    public RentalSummary(
            String customerName,
            int customerAge,
            LocalDate contractStartDate,
            LocalDate contractEndDate,
            List<Rental> rentals,
            Optional<Rental> nextDueRental,
            double totalCapitalAmount,
            double totalInterestAmount,
            long outstandingRentalCount
    ) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.rentals = rentals;
        this.nextDueRental = nextDueRental;
        this.totalCapitalAmount = totalCapitalAmount;
        this.totalInterestAmount = totalInterestAmount;
        this.outstandingRentalCount = outstandingRentalCount;

    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    public LocalDate getContractEndDate() {
        return contractEndDate;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public Optional<Rental> getNextDueRental() {
        return nextDueRental;
    }

    public double getTotalCapitalAmount() {
        return totalCapitalAmount;
    }

    public double getTotalInterestAmount() {
        return totalInterestAmount;
    }

    public long getOutstandingRentalCount() {
        return outstandingRentalCount;
    }
}
