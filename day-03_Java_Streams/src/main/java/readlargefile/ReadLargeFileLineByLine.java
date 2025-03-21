package readlargefile;
import java.io.*;
// Creating class ReadLargeFileLineByLine to read a large text file line by line
public class ReadLargeFileLineByLine
{
    // Main method
    public static void main(String[] args)
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_03_Java_Streams\\sourcefile.txt";

        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                if (line.toLowerCase().contains("error"))
                {
                    System.out.println(line);
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred due to " + e.getMessage());
        }
    }
}

