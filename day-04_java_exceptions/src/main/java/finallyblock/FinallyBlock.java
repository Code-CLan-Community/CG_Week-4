package finallyblock;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
            scanner.close();
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}

