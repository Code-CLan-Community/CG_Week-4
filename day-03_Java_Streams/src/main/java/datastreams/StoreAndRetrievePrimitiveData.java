package datastreams;

import java.io.*;
// Creating class StoreAndRetrievePrimitiveData to store and retrieve primitive data
public class StoreAndRetrievePrimitiveData
{
    // Main method
    public static void main(String[] args)
    {
        // Storing file path
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_03_Java_Streams\\sourcefile.txt";

        // Store student details
        try
        {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filePath));
            dataOutputStream.writeInt(101);
            dataOutputStream.writeUTF("Rajan");
            dataOutputStream.writeDouble(9.6);

            dataOutputStream.writeInt(102);
            dataOutputStream.writeUTF("Sachin");
            dataOutputStream.writeDouble(9.2);

            System.out.println("Student details saved successfully ");

        }
        catch (IOException e)
        {
            System.out.println("An error occurred due to " + e.getMessage());
        }

        // Displaying student details
        try
        {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filePath));
            while (dataInputStream.available() > 0)
            {
                int studentRollNumber = dataInputStream.readInt();
                String studentName = dataInputStream.readUTF();
                double studentGPA = dataInputStream.readDouble();
                System.out.println("Roll No " + studentRollNumber + ", Name " + studentName + ", GPA " + studentGPA);
            }

        }
        catch (IOException e)
        {
            System.out.println("An error occurred due to " + e.getMessage());
        }
    }
}


