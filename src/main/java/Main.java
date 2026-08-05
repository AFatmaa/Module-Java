import java.time.LocalDate;

/**
 * Runs examples of the rental summary generator.
 */
public class Main {

    /**
     * Creates different contracts and prints their rental summaries.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        RentalSummaryService rentalSummaryService = new RentalSummaryService();

        Contract oneYearContract = new Contract(
                "John Smith",
                25,
                LocalDate.of(2025, 8, 12),
                1,
                10000
        );

        Contract twoYearContract = new Contract(
                "Michael Jones",
                56,
                LocalDate.of(2025, 12, 12),
                2,
                20000
        );

        Contract threeYearContract = new Contract(
                "Jane Doe",
                77,
                LocalDate.of(2024, 4, 1),
                3,
                50000
        );

        Contract completedContract = new Contract(
                "Rosie Parker",
                47,
                LocalDate.of(2021, 7, 10),
                3,
                40000
        );

        System.out.println("ONE-YEAR CONTRACT");
        rentalSummaryService.printRentalSummary(oneYearContract);


        System.out.println();
        System.out.println("TWO-YEAR CONTRACT");

        try {
            rentalSummaryService.printRentalSummary(twoYearContract);
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        System.out.println();
        System.out.println("THREE-YEAR CONTRACT");
        rentalSummaryService.printRentalSummary(threeYearContract);

        System.out.println();
        System.out.println("COMPLETED CONTRACT");
        rentalSummaryService.printRentalSummary((completedContract));

    }
}
