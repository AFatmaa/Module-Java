import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThreeYearContractRentalGeneratorTest {

    private ThreeYearContractRentalGenerator generator;

    @BeforeEach
    void setUp() {
        generator = new ThreeYearContractRentalGenerator();
    }

    private Contract createThreeYearContract(LocalDate startDate) {
        return new Contract(
                "Fatma Arslantas",
                37,
                startDate,
                3,
                36000
        );
    }

    @Test
    void generatesThirtySixRentals() {
        Contract contract = createThreeYearContract(LocalDate.now());

        List<Rental> rentals = generator.generateRentals(contract);

        assertEquals(36, rentals.size());
    }

    @Test
    void calculatesMonthlyAmounts() {
        Contract contract = createThreeYearContract(LocalDate.now());

        List<Rental> rentals = generator.generateRentals(contract);

        Rental firstRental = rentals.get(0);

        assertEquals(1000, firstRental.getCapitalAmount(), 0.001);

        assertEquals(30, firstRental.getInterestAmount(), 0.001);
    }

    @Test
    void setsCorrectDueDates() {
        LocalDate startDate = LocalDate.of(2026, 1, 10);

        Contract contract = createThreeYearContract(startDate);

        List<Rental> rentals = generator.generateRentals(contract);

        Rental firstRental = rentals.get(0);
        Rental lastRental = rentals.get(35);

        assertEquals(startDate.plusMonths(1), firstRental.getDueDate());

        assertEquals(startDate.plusMonths(36), lastRental.getDueDate());
    }

    @Test
    void marksPastRentalsAsPaid() {
        Contract contract = createThreeYearContract(LocalDate.now().minusYears(4));

        List<Rental> rentals = generator.generateRentals(contract);

        boolean allRentalsArePaid = rentals.stream()
                .allMatch(Rental::isPaid);

        assertTrue(allRentalsArePaid);
    }

    @Test
    void marksFutureRentalsAsUnpaid() {
        Contract contract = createThreeYearContract(LocalDate.now().plusYears(1));

        List<Rental> rentals = generator.generateRentals(contract);

        boolean noRentalsArePaid = rentals.stream()
                .noneMatch(Rental::isPaid);

        assertTrue(noRentalsArePaid);
    }
}