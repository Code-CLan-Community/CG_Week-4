package checkedexception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
// Creating class CheckedException to perform compile time exception
public class CheckedException
{
    public static void readFile(String filePath)
    {
        // Handling IO exception
        try
        {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // Checking if file exist or not
            if(!file.exists())
            {
                throw new IOException("File not found");
            }

            String read;
            while((read = bufferedReader.readLine()) != null)
            {
                System.out.println(read);
            }

            // Closing streams
            fileReader.close();
            bufferedReader.close();
        }
        catch (IOException e)
        {
            System.out.println("An IOException occurred due to " + e.getMessage());
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
