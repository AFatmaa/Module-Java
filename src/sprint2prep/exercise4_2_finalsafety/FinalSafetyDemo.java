package sprint2prep.exercise4_2_finalsafety;

/**
 * Runs the final safety exercise.
 */
public class FinalSafetyDemo {
    public static void main(String[] args) {
        System.out.println("Configuration example:");
        Configuration configuration = new Configuration("Payment System");

        System.out.println("Max users: " + Configuration.MAX_USERS);
        System.out.println("System name: " + configuration.getSystemName());

        /**
         * This would not compile because MAX_USERS is final.
         */
        // Configuration.MAX_USERS = 200;

        System.out.println();
        System.out.println("Polygon example:");

        Polygon square = new Polygon(4);
        square.describe();

        Triangle triangle = new Triangle();
        triangle.describe();

        System.out.println("Triangle sides: " + triangle.getNumberOfSides());
    }
}
