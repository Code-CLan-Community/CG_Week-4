package finallyblockexecution;

import java.util.Scanner;
// Creating class FinallyBlockExecution to implement finally block
public class FinallyBlockExecution
{
    // Method to perform division operation
    public static void division(int num1, int num2)
    {
        // Handling ArithmeticException
        try
        {
            int num = (num1 / num2);
            System.out.println("Division of two number is " + num);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException occurred due to " + e.getMessage());
        }
        finally
        {
            System.out.println("Operation completed");
        }
    }
    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Handling InputMismatchException
        System.out.println("Enter first number ");
        int num1 = input.nextInt();

        System.out.println("Enter Second number ");
        int num2 = input.nextInt();
        // calling method division
        division(num1, num2);
    }
}
