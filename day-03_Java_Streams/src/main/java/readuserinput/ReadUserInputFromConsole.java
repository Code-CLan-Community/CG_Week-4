package readuserinput;
import java.io.*;
// Creating class ReadUserInputFromConsole to read data from console
public class ReadUserInputFromConsole
{
    // Main Method
    public static void main(String[] args)
    {
        // Storing file path
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_03_Java_Streams\\destinationfile.txt";
        // Handling Exception
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fileWriter = new FileWriter(filePath);

            // Reading data from console
            System.out.print("Enter your name:- ");
            String name = bufferedReader.readLine();

            System.out.print("Enter your age:- ");
            String age = bufferedReader.readLine();

            System.out.print("Enter your favorite programming language:- ");
            String language = bufferedReader.readLine();

            // Writing read data into console
            fileWriter.write("Name " + name + "\n");
            fileWriter.write("Age " + age + "\n");
            fileWriter.write("Favorite Programming Language " + language + "\n");

            System.out.println("User information saved successfully ");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred due to " + e.getMessage());
        }
    }
}


