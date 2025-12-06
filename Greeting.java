// Greeting.java
// Prints a personalized greeting when a name is provided, otherwise prints a default greeting.

public class Greeting {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello, World!");
            System.out.println("(Usage: java Greeting [name])");
        }
    }
}
