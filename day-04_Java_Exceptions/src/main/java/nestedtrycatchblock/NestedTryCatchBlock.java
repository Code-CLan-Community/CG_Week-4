package nestedtrycatchblock;

import java.util.Scanner;
// Creating class NestedTryCatchBlock to implement nested try catch block
public class NestedTryCatchBlock
{
    // Method to divide array element with specific divisor
    public static void arrayDivision(int[] arr, int divisor,int index)
    {
        // Handling ArrayIndexOutOfBoundsException
        try
        {
            int num = arr[index];
            // Handling ArithmeticException
            try
            {
                int result = num/divisor;
                System.out.println(result);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Cannot divide by zero!");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid array index!");
        }
    }
    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of the array ");
        int length = input.nextInt();
        int[] arr = new int[length];

        // Taking array value from user
        for (int i = 0; i < length; i++) {
            System.out.println("Enter array element ");
            arr[i] = input.nextInt();
        }

        System.out.println("Enter divisor number ");
        int divisor = input.nextInt();

        System.out.println("Enter index ");
        int index = input.nextInt();
        // Calling method
        arrayDivision(arr, divisor, index);
    }
}
