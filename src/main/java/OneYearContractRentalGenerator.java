import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Generates monthly rental payments for a one-year contract.
 */
public class OneYearContractRentalGenerator implements RentalCalculator {

    private static final int NUMBER_OF_RENTALS = 12;
    private static final double INTEREST_RATE = 0.02;

    /**
     * Generates twelve monthly rental payments for the given contract.
     *
     * @param contract the contract used to calculate the rental payments
     * @return the generated monthly rental payments
     */
    @Override
    public List<Rental> generateRentals(Contract contract) {
        List<Rental> rentals = new ArrayList<>();

        double monthlyCapitalAmount = contract.getCarPrice() / NUMBER_OF_RENTALS;

        double monthlyInterestAmount = (contract.getCarPrice() * INTEREST_RATE) / NUMBER_OF_RENTALS;

        LocalDate currentDate = LocalDate.now();

        for (int monthNumber = 1; monthNumber <= NUMBER_OF_RENTALS; monthNumber++) {
            LocalDate dueDate = contract.getStartDate().plusMonths(monthNumber);
            boolean paid = !dueDate.isAfter(currentDate);

            Rental rental = new Rental(
                    dueDate,
                    monthlyCapitalAmount,
                    monthlyInterestAmount,
                    paid
            );

            rentals.add(rental);
        }

        return rentals;
    }
}
