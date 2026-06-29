public class JavaKeywordsSyntax {
    public static void main(String[] args) {
        // public: this class or method can be accessed from outside
        // class: used to create a Java class
        // static: this method can run without creating an object
        // void: this method does not return a value
        // main: the starting point of the Java program

        // byte: very small whole number
        byte smallNumber = 100;

        // short: small whole number
        short mediumNumber = 30000;

        // int: whole number
        int age = 36;

        // long: bigger whole number
        long population = 67000000L;

        // float: decimal number, less precise
        float temperature = 23.5F;

        // double: decimal number
        double price = 12.99;

        // boolean: true or false
        boolean isLearningJava = true;

        // char: one single character
        char grade = 'A';

        System.out.println("Byte: " + smallNumber); // I removed a semicolon and IntelliJ showed a compilation error. I fixed it by adding the semicolon back.
        System.out.println("Short: " + mediumNumber);
        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Temperature: " + temperature);
        System.out.println("Price: " + price);
        System.out.println("Is learning Java: " + isLearningJava);
        System.out.println("Grade: " + grade);

    }
}

