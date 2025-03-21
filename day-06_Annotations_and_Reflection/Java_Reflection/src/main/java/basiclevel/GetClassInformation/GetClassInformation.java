package basiclevel.GetClassInformation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
// Creating class GetClassInformation
public class GetClassInformation
{
    // Main method
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = scanner.nextLine();

        try
        {
            // Load the class
            Class<?> cls = Class.forName(className);

            // Display class name
            System.out.println("Class: " + cls.getName());

            // Display constructors
            Constructor<?>[] constructors = cls.getConstructors();
            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : constructors)
            {
                System.out.println(" " + constructor);
            }

            // Display fields
            Field[] fields = cls.getDeclaredFields();
            System.out.println("\nFields:");
            for (Field field : fields)
            {
                System.out.println(" " + field);
            }

            // Display methods
            Method[] methods = cls.getDeclaredMethods();
            System.out.println("\nMethods:");
            for (Method method : methods)
            {
                System.out.println(" " + method);
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
        finally
        {
            scanner.close();
        }
    }
}
