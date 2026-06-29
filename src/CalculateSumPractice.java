public class CalculateSumPractice {
    public static void main(String[] args) {
        int total = calculateSum(5, 7);
        System.out.println("Total: " + total);
    }

    /**
     * Calculates the sum of two integers.
     *
     * @param firstNumber  the first integer
     * @param secondNumber the second integer
     * @return the sum of firstNumber and secondNumber
     */
    private static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}