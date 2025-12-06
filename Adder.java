// Adder.java
// Sums integer command-line arguments and prints the result.
// Usage: java Adder 1 2 3

public class Adder {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Adder <int1> <int2> ...");
            return;
        }

        int sum = 0;
        for (String s : args) {
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.err.println("Invalid integer: " + s);
                System.exit(1);
            }
        }

        System.out.println("Sum: " + sum);
    }
}
