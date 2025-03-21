package nestedtrycatch;

import java.util.Scanner;

public class NestedTryCatch {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = {10, 20, 30, 40, 50};

            try {
                System.out.print("Enter index: ");
                int index = scanner.nextInt();

                try {
                    int element = array[index];
                    System.out.print("Enter divisor: ");
                    int divisor = scanner.nextInt();

                    try {
                        int result = element / divisor;
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Cannot divide by zero!");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid array index!");
                }
            } finally {
                System.out.println("Operation completed");
                scanner.close();
            }
        }
    }

