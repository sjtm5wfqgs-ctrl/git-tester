// Multiplier.java
// Multiplies two integer command-line arguments and prints the product.
// Usage: java Multiplier 3 7

public class Multiplier {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Multiplier <int1> <int2>");
            return;
        }

        try {
            long a = Long.parseLong(args[0]);
            long b = Long.parseLong(args[1]);
            System.out.println("Product: " + (a * b));
        } catch (NumberFormatException e) {
            System.err.println("Both arguments must be integers.");
            System.exit(1);
        }
    }
}
