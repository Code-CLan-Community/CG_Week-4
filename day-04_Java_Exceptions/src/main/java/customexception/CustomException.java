package customexception;

import java.util.Scanner;
// Creating class CustomException to create a user defined exception
public class CustomException extends Exception
{
    public CustomException(String message)
    {
        super(message);
    }
    // Method to validate age
    public static void validateAge(int age) throws CustomException
    {
        // if age is less than 18 then it through custom exception
        if (age < 18)
        {
            throw new CustomException("Age must be 18 or above");
        }
        else
        {
            System.out.println("Access granted!");
        }
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter your age ");
        int age = input.nextInt();
        // calling method
        try {
            validateAge(15);
        }
        catch (CustomException e)
        {
            System.out.println("Caught custom exception " + e.getMessage());
        }
    }
}
