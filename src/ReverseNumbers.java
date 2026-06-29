public class ReverseNumbers {
    public static void main(String[] args) {
        int originalNumber = 3956;
        int reversedNumber = reverseNumber(originalNumber);

        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }

    /**
     * Reverses the digits of a positive integer.
     *
     * @param number the number to reverse
     * @return the number with its digits in reverse order
     */
    private static int reverseNumber(int number) {
        int reversedNumber = 0;
        int remaningNumber = number;

        while (remaningNumber > 0) {
            int digit = remaningNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            remaningNumber = remaningNumber / 10;
        }

        return reversedNumber;
    }
}
