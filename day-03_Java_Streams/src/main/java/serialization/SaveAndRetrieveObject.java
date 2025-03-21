package serialization;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Creating class SaveAndRetrieveObject to store a list of employees in a file
public class SaveAndRetrieveObject
{
    // Main method
    public static void main(String[] args)
    {
        // Creating object of employee class
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Rajan", "HR", 30000));
        employees.add(new Employee(102, "Sachin", "IT", 25000));

        // Serializing the employee list to a file
        try
        {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employees.ser"));
            objectOutputStream.writeObject(employees);
            System.out.println("Employee data serialized successfully ");

        }
        catch (IOException e)
        {
            System.out.println("An error occurred due to " + e.getMessage());
        }

        // Deserializing the employee list from the file
        try
        {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employees.ser"));

            List<Employee> deserializedEmployees = (List<Employee>) objectInputStream.readObject();
            System.out.println("Employee data deserialized successfully ");
            for (Employee employee : deserializedEmployees)
            {
                System.out.println(employee);
            }

        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println("An error occurred due to " + e.getMessage());
        }
    }
}

