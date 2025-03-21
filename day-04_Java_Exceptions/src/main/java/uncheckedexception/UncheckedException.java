package uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;
// Creating class UncheckedException to perform runtime exception
public class UncheckedException
{
    // Method to perform division operation
    public static void division(int num1, int num2)
    {
        // Handling ArithmeticException
        try
        {
            int num =  (num1 / num2);
            System.out.println("Division of two number is " + num);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException occurred due to " + e.getMessage());
        }
    }
    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Handling InputMismatchException
        try
        {
            System.out.println("Enter first number ");
            int num1 = input.nextInt();

            System.out.println("Enter Second number ");
            int num2 = input.nextInt();
            // calling method
            division(num1, num2);
        }
        catch (InputMismatchException e)
        {
            System.out.println("InputMismatchException occurred due to " + e.getMessage());
        }
    }
}
