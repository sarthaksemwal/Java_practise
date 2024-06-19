public class DivisionExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result = 0;

        try {
            result = numerator / denominator; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: Division by zero");
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }

        System.out.println("Result is: " + result);
        System.out.println("Program continues after try-catch-finally.");
    }
}
