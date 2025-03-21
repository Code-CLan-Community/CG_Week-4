package customexception;

import java.util.Scanner;

// Custom exception class
public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    // Method to validate age
    private static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be greater than 18");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object to take user input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age); // Validate user age
        } catch (CustomException e) {
            System.out.println(e.getMessage()); // Print custom exception message
        }
    }
}