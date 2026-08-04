import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OneYearContractRentalGeneratorTest {

    private OneYearContractRentalGenerator generator;

    @BeforeEach
    void setUp() {
        generator = new OneYearContractRentalGenerator();
    }

    private Contract createOneYearContract(LocalDate startDate) {
        return new Contract(
                "Fatma Arslantas",
                37,
                startDate,
                1,
                12000
        );
    }

    @Test
    void generatesTwelveRentals() {
        Contract contract = createOneYearContract(LocalDate.now());

        List<Rental> rentals = generator.generateRentals(contract);

        assertEquals(12, rentals.size());
    }

    @Test
    void calculatesMonthlyAmounts() {
        Contract contract = createOneYearContract(LocalDate.now());

        List<Rental> rentals = generator.generateRentals(contract);

        Rental firstRental = rentals.get(0);

        assertEquals(1000, firstRental.getCapitalAmount(), 0.01);
    }

    @Test
    void setsCorrectDueDates() {
        LocalDate startDate = LocalDate.of(2026, 1, 10);

        Contract contract = createOneYearContract(startDate);

        List<Rental> rentals = generator.generateRentals(contract);

        Rental firstRental = rentals.get(0);
        Rental lastRental = rentals.get(11);

        assertEquals(startDate.plusMonths(1), firstRental.getDueDate());

        assertEquals(startDate.plusMonths(12), lastRental.getDueDate());
    }

    @Test
    void marksPastRentalsAsPaid() {
        Contract contract = createOneYearContract(LocalDate.now().minusYears(2));

        List<Rental> rentals = generator.generateRentals(contract);

        boolean allRentalsArePaid = rentals.stream()
                .allMatch(Rental::isPaid);

        assertTrue(allRentalsArePaid);
    }

    @Test
    void marksFutureRentalsAsUnpaid() {
        Contract contract = createOneYearContract(LocalDate.now().plusYears(1));

        List<Rental> rentals = generator.generateRentals(contract);

        boolean noRentalsArePaid = rentals.stream()
                .noneMatch(Rental::isPaid);

        assertTrue(noRentalsArePaid);
    }
}
