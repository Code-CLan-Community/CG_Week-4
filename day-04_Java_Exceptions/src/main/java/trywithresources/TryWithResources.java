package trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources
{
    public static void readFile(String filePath) {
        // Handling IO exception
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            System.out.println(bufferedReader.readLine());
        }
        catch (IOException e)
        {
            System.out.println("Error reading file ");
        }
    }
    // Main method
    public static void main(String[] args)
    {
        // Storing filepath
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_04_Java_Exceptions\\data.txt";
        readFile(filePath);
    }
}
