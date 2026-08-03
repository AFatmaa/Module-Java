import java.time.LocalDate;

/**
 * Represents a car rental contract for a customer.
 */
public class Contract {

    private String customerName;
    private int customerAge;
    private LocalDate startDate;
    private int contractLengthYears;
    private double carPrice;

    /**
     * Creates a new rental contract.
     *
     * @param customerName       the name of the customer
     * @param customerAge        the age of the customer
     * @param startDate          the start date of the contract
     * @param contractLengthYears the length of the contract in years
     * @param carPrice           the price of the car
     */
    public Contract(
            String customerName,
            int customerAge,
            LocalDate startDate,
            int contractLengthYears,
            double carPrice
    ) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.startDate = startDate;
        this.contractLengthYears = contractLengthYears;
        this.carPrice = carPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getContractLengthYears() {
        return contractLengthYears;
    }

    public double getCarPrice() {
        return carPrice;
    }
}
