public class PrimeNumbers {
    public static void main(String[] args) {
        int upperLimit = 1000;
        printPrimeNumbersUpTo(upperLimit);
    }

    /**
     * Prints all prime numbers from 2 up to the given upper limit.
     *
     * @param upperLimit the maximum number to check
     */
    private static void printPrimeNumbersUpTo(int upperLimit) {
        for (int number = 2; number <= upperLimit; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    /**
     * Checks whether a number is prime.
     * A prime number is greater than 1 and can only be divided by 1 and itself.
     *
     * @param number the number to check
     * @return true if the number is prime, otherwise false
     */
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
