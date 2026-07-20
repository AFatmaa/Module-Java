package exercise1_1_calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void testDivide() {
        int result = calculator.divide(10, 2);

        assertEquals(5, result);
    }

    @Test
    void testDivideByZeroThrows() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );
    }
}
