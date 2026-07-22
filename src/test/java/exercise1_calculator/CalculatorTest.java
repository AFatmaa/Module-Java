package exercise1_calculator;

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

    @Test
    void testSquare() {
        int result = calculator.square(4);

        assertEquals(16, result);
    }

    @Test
    void testSquareRoot() {
        double result = calculator.squareRoot(9);

        assertEquals(3.0, result);
    }

    @Test
    void testSquareRootNegativeNumberThrows() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.squareRoot(-9)
        );
    }

    @Test
    void testSquareRootWithDecimalResult() {
        double result = calculator.squareRoot(3);

        // Allow a small difference because decimal results may not be exact.
        assertEquals(1.732, result, 0.001);
    }
}
