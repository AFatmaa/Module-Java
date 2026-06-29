public class DebuggingPractice {
    public static void main(String[] args) {
        int result = calculateSumFromOneToHundred();
        System.out.println("Result: " + result);
    }

    private static int calculateSumFromOneToHundred() {
        int sum = 0;

        // I first started this loop at -1 to practise debugging.
        // By inspecting number and sum in the debugger, I found the bug.
        // The loop should start at 1 because the task asks for the sum from 1 to 100.
        for (int number = 1; number <= 100; number++) {
            sum = sum + number;
        }

        return sum;
    }
}