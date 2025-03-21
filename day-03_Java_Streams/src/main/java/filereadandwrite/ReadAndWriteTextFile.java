package filereadandwrite;
import java.io.*;
// Creating class ReadAndWriteTextFile to read and write a text file
public class ReadAndWriteTextFile
{
    // Main method
    public static void main(String[] args)
    {
        // Storing file path
        String sourceFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_03_Java_Streams\\sourcefile.txt";
        String destinationFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_03_Java_Streams\\destinationfile.txt";

        // Handling Exception
        try
        {
            File sourceFile = new File(sourceFilePath);
            // Checking file exist or not
            if (!sourceFile.exists())
            {
                System.out.println("The source file does not exist");
                return;
            }

            FileInputStream fileInputStream = new FileInputStream(sourceFilePath);
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFilePath);

            int readData;
            // Copying the text of source file to destination file
            while ((readData = fileInputStream.read()) != -1)
            {
                fileOutputStream.write(readData);
            }
            System.out.println("File copied successfully");

        }
        catch (IOException e)
        {
            System.out.println("An error occurred due to " + e.getMessage());
        }
    }
}

