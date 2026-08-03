import java.util.List;

/**
 * Defines how monthly rental payments are generated for a contract.
 */
public interface RentalCalculator {

    /**
     * Generates the monthly payments for the given contract.
     *
     * @param contract the contract used to calculate the payments
     * @return the generated monthly rental payments
     */
    List<Rental> generateRentals(Contract contract);
}
