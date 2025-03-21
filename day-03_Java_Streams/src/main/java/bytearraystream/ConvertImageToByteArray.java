package bytearraystream;
import java.io.*;
// Creating class ConvertImageToByteArray to converts an image file into a byte array
public class ConvertImageToByteArray
{
    // Main method
    public static void main(String[] args)
    {
        // Source image and destination file paths
        String sourceImagePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_03_Java_Streams\\cg logo.png";
        String destinationImagePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_03_Java_Streams\\copied_image.jpg";

        try
        {
            // Reading the image into a byte array
            FileInputStream fileInputStream = new FileInputStream(sourceImagePath);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int readData;
            while ((readData = fileInputStream.read(buffer)) != -1)
            {
                byteArrayOutputStream.write(buffer, 0, readData);
            }

            byte[] imageBytes = byteArrayOutputStream.toByteArray();
            System.out.println("Image converted to byte array successfully");

            // Writing the byte array back to a new image file
            FileOutputStream fileOutputStream = new FileOutputStream(destinationImagePath);
            fileOutputStream.write(imageBytes);

            System.out.println("Image written back successfully");

            // Closing the streams
            fileInputStream.close();
            byteArrayOutputStream.close();
            fileOutputStream.close();

        }
        catch (IOException e)
        {
            System.out.println("An error occurred due to " + e.getMessage());
        }
    }
}



