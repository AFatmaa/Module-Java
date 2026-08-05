import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RentalSummaryServiceTest {

    @Test
    void rejectsUnsupportedContractLength() {
        RentalSummaryService service = new RentalSummaryService();

        Contract contract = new Contract(
                "Michael Jones",
                56,
                LocalDate.now(),
                2,
                20000
        );

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.printRentalSummary(contract)
        );

        assertEquals("Contract length must be 1 or 3 years", exception.getMessage());
    }
}