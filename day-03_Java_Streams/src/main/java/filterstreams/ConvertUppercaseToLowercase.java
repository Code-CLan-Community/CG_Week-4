package filterstreams;
import java.io.*;
// Creating class ConvertUppercaseToLowercase to convert all uppercase letters to lowercase
public class ConvertUppercaseToLowercase
{
    // Main Method
    public static void main(String[] args)
    {
        // Storing file path
        String sourceFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_03_Java_Streams\\sourcefile.txt";
        String destinationFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_03_Java_Streams\\destinationfile.txt";

        // Handling Exception
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFilePath));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFilePath));

            int readdata;
            while ((readdata = bufferedReader.read()) != -1)
            {
                bufferedWriter.write(Character.toLowerCase(readdata));
            }
            System.out.println("File converted successfully");

        }
        catch (IOException e)
        {
            System.out.println("An error occurred due to " + e.getMessage());
        }
    }
}

