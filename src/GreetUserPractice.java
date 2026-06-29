public class GreetUserPractice {
    public static void main(String[] args) {
        String greetingMessage = greetUser("Alice");
        System.out.println(greetingMessage);
    }

    private static String greetUser(String name) {
        return "Hello, " + name + "!";
    }
}

//I created a private method called greetUser. It takes one String parameter called name and returns a String greeting message.
//The keyword private means the method can only be used inside this class.
//The keyword static means I can call it from the static main method without creating an object.
//String before the method name is the return type. It means this method returns a String value.
//greetUser is the method name.
//String name is the parameter. It means the method accepts a String value and uses it as name.