package multiplecatchblocks;

import java.util.Scanner;
// Creating class MultipleCatchBlocks to implement multiple catch with single try block
public class MultipleCatchBlocks
{
    // Method to find target element using given index
    public static void findTarget(int[] arr, int index)
    {
        try
        {
            System.out.println("Value at index " + index + " : " + arr[index]);
        }
        // Handling ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index! " + e.getMessage());
        }
        // Handling NullPointerException
        catch (NullPointerException e)
        {
            System.out.println("Array is not initialized! " + e.getMessage());
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
        for (int i=0;i<length;i++)
        {
            System.out.println("Enter array element ");
            arr[i] = input.nextInt();
        }
        System.out.println("Enter target element index number ");
        int targetIndexNumber = input.nextInt();
        // Assigning null in arr for null
        if(targetIndexNumber == 0)
        {
            arr = null;
        }
        // calling method
        findTarget(arr, targetIndexNumber);
    }
}
