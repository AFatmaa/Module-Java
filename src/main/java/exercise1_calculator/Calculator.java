package exercise1_calculator;

/**
 * Provides basic arithmetic and square root calculations.
 */
public class Calculator {
    /**
     * Adds two integers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of the two numbers
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first integer.
     *
     * @param a the number to subtract from
     * @param b the number to subtract
     * @return the difference between the two numbers
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of the two numbers
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second integer.
     *
     * @param a the number to divide
     * @param b the number to divide by
     * @return the result of dividing the first number by the second number
     * @throws IllegalArgumentException if the second number is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }

        return a / b;
    }

    /**
     * Calculates the square of an integer.
     *
     * @param a the number to square
     * @return the square of the number
     * @see #multiply(int, int)
     */
    public int square(int a) {
        return a * a;
    }

    /**
     * Calculates the square root of a non-negative integer.
     *
     * @param a the number whose square root will be calculated
     * @return the square root of the number
     * @throws IllegalArgumentException if the number is negative
     * @see #square(int)
     */
    public double squareRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException(
                    "Cannot calculate the square root of a negative number"
            );
        }
        return Math.sqrt(a);
    }
}
