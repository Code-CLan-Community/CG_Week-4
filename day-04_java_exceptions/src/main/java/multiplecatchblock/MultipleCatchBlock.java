package multiplecatchblock;

import java.util.Scanner;

public class MultipleCatchBlock {
    static void arrayIndexOutOfBounds(int[] arr, int index) {
        return;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};  // Initialize array
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();  // Get index from user

        try {
            arrayIndexOutOfBounds(arr, index);  // Call method
            System.out.println("Value of index " + index + " : " + arr[index]);
            arr = null;  // Set array to null
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        } catch (NullPointerException e) {
            System.out.println("Array is not Initialized");
        }
    }
}
