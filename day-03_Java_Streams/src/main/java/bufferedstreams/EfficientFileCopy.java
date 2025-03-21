package bufferedstreams;
import java.io.*;
// Creating class EfficientFileCopy to efficiently copy one file into another
public class EfficientFileCopy
{
    // Method to copy File using BufferedStreams
    private static void copyingFileUsingBufferedStreams(String sourceFilePath, String destinationFilePath)
    {
        try
        {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(sourceFilePath), 4096);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destinationFilePath), 4096);

            byte[] buffer = new byte[4096];
            int readData;
            // Copying the text of source file to destination file
            while ((readData = bufferedInputStream.read(buffer)) != -1)
            {
                bufferedOutputStream.write(buffer, 0, readData);
            }
            System.out.println("File copied using buffered streams ");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred due to " + e.getMessage());
        }
    }
    // Method to copy File using FileInputStreams
    private static void copyingFileUsingFileInputStreams(String sourceFilePath, String destinationFilePath)
    {
        // Handling Exception
        try
        {
            FileInputStream fileInputStream = new FileInputStream(sourceFilePath);
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFilePath);

            int readData;
            // Copying the text of source file to destination file
            while ((readData = fileInputStream.read()) != -1)
            {
                fileOutputStream.write(readData);
            }
            System.out.println("File copied using file input streams");

        }
        catch (IOException e)
        {
            System.out.println("An error occurred due to " + e.getMessage());
        }
    }
    // Main Method
    public static void main(String[] args)
    {
        String sourceFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_03_Java_Streams\\sourcefile.txt";
        String destinationFilePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_03_Java_Streams\\destinationfile.txt";

        // Time take by buffered streams
        long startTimeOfBufferStream = System.nanoTime();
        copyingFileUsingBufferedStreams(sourceFilePath, destinationFilePath);
        long endTimeOfBufferStream = System.nanoTime();


        // Time take by file input streams
        long startTimeOfFileInputStream = System.nanoTime();
        copyingFileUsingFileInputStreams(sourceFilePath, destinationFilePath);
        long endTimeOfFileInputStream = System.nanoTime();

        // Print execution time
        System.out.println("Time taken by Buffer Streams " + (endTimeOfBufferStream - startTimeOfBufferStream));
        System.out.println("Time take by File Input Streams " + (endTimeOfFileInputStream - startTimeOfFileInputStream) );
    }
}


