import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Generates and prints summaries for rental contracts.
 */
public class RentalSummaryService {

    private RentalCalculator getRentalCalculator(Contract contract) {
        if (contract.getContractLengthYears() == 1) {
            return new OneYearContractRentalGenerator();
        }

        if (contract.getContractLengthYears() == 3) {
            return new ThreeYearContractRentalGenerator();
        }

        throw new IllegalArgumentException("Contract length must be 1 or 3 years");
    }

    private Optional<RentalSummary> generateRentalSummary(Contract contract) {
        RentalCalculator rentalCalculator = getRentalCalculator(contract);

        List<Rental> rentals = rentalCalculator.generateRentals(contract);

        List<Rental> sortedRentals = rentals.stream()
                .sorted(Comparator.comparing(Rental::getDueDate))
                .toList();

        Rental finalRental = sortedRentals.get(sortedRentals.size() - 1);

        LocalDate contractEndDate = finalRental.getDueDate();

        if (LocalDate.now().isAfter(contractEndDate)) {
            return Optional.empty();
        }

        Optional<Rental> nextDueRental = sortedRentals.stream()
                .filter(rental -> !rental.isPaid())
                .findFirst();

        double totalCapitalAmount = sortedRentals.stream()
                .mapToDouble(Rental::getCapitalAmount)
                .sum();

        double totalInterestAmount = sortedRentals.stream()
                .mapToDouble(Rental::getInterestAmount)
                .sum();

        long outstandingRentalCount = sortedRentals.stream()
                .filter(rental -> !rental.isPaid())
                .count();

        RentalSummary rentalSummary = new RentalSummary(
                contract.getCustomerName(),
                contract.getCustomerAge(),
                contract.getStartDate(),
                contractEndDate,
                sortedRentals,
                nextDueRental,
                totalCapitalAmount,
                totalInterestAmount,
                outstandingRentalCount
        );

        return Optional.of(rentalSummary);
    }

    /**
     * Generates and prints a rental summary for the given contract.
     *
     * @param contract the contract to summarize
     */
    public void printRentalSummary(Contract contract) {
        Optional<RentalSummary> rentalSummary = generateRentalSummary(contract);
        rentalSummary.ifPresentOrElse(this::printSummary, () -> System.out.println("Contract is completed."));
    }

    private void printSummary(RentalSummary summary) {
        System.out.println("Rental Summary");
        System.out.println("Customer name: " + summary.getCustomerName());
        System.out.println("Customer age: " + summary.getCustomerAge());
        System.out.println("Contract start date: " + summary.getContractStartDate());
        System.out.println("Contract end date: " + summary.getContractEndDate());
        System.out.println();
        System.out.println("Rentals:");
        summary.getRentals().forEach(this::printRental);
        System.out.println();
        summary.getNextDueRental().ifPresentOrElse(
                rental -> System.out.println("Next due rental: " + rental.getDueDate()),
                () -> System.out.println("Next due rental: None")
        );

        System.out.printf("Total capital amount: £%.2f%n", summary.getTotalCapitalAmount());
        System.out.printf("Total interest amount: £%.2f%n", summary.getTotalInterestAmount());
        System.out.println("Outstanding rentals: " + summary.getOutstandingRentalCount());
    }

    private void printRental(Rental rental) {
        System.out.printf("Due date: %s | Capital: £%.2f | Interest: £%.2f | Paid: %s%n",
                rental.getDueDate(),
                rental.getCapitalAmount(),
                rental.getInterestAmount(),
                rental.isPaid()
        );
    }
}
