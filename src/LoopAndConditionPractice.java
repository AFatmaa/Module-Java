public class LoopAndConditionPractice {
    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }

        int numberToCheck = 41;

        if (numberToCheck % 2 == 0) {
            System.out.println(numberToCheck + " is even.");
        } else {
            System.out.println(numberToCheck + " is odd.");
        }
    }
}