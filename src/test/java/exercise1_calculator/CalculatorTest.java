package exercise1_calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the behavior of the {@link Calculator} class.
 *
 * @see Calculator
 */
public class CalculatorTest {

    private Calculator calculator;

    /**
     * Creates a new Calculator instance before each test.
     */
    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    /**
     * Verifies that two integers are added correctly.
     *
     * @see Calculator#add(int, int)
     */
    @Test
    void testAdd() {
        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    /**
     * Verifies that one integer is divided by another correctly.
     *
     * @see Calculator#divide(int, int)
     */
    @Test
    void testDivide() {
        int result = calculator.divide(10, 2);

        assertEquals(5, result);
    }

    /**
     * Verifies that dividing by zero throws an IllegalArgumentException.
     *
     * @see Calculator#divide(int, int)
     */
    @Test
    void testDivideByZeroThrows() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );
    }

    /**
     * Verifies that the square of an integer is calculated correctly.
     *
     * @see Calculator#square(int)
     */
    @Test
    void testSquare() {
        int result = calculator.square(4);

        assertEquals(16, result);
    }

    /**
     * Verifies that the square root of a perfect square is calculated correctly.
     *
     * @see Calculator#squareRoot(int)
     */
    @Test
    void testSquareRoot() {
        double result = calculator.squareRoot(9);

        assertEquals(3.0, result);
    }

    /**
     * Verifies that calculating the square root of a negative number
     * throws an IllegalArgumentException.
     *
     * @see Calculator#squareRoot(int)
     */
    @Test
    void testSquareRootNegativeNumberThrows() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.squareRoot(-9)
        );
    }

    /**
     * Verifies a decimal square root result using a small tolerance.
     *
     * @see Calculator#squareRoot(int)
     */
    @Test
    void testSquareRootWithDecimalResult() {
        double result = calculator.squareRoot(3);

        // Allow a small difference because decimal results may not be exact.
        assertEquals(1.732, result, 0.001);
    }
}
