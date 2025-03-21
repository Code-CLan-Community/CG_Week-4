package basiclevel.AccessPrivateField;
import java.lang.reflect.Field;
// Creating class AccessPrivateField
public class AccessPrivateField
{
    // Main method
    public static void main(String[] args)
    {
        try
        {
            Person person = new Person(22);

            // Access the private field 'age'
            Field field = Person.class.getDeclaredField("age");
            field.setAccessible(true); // Make the private field accessible

            // Get and print the value of 'age'
            int age = (int) field.get(person);
            System.out.println("Original Age: " + age);

            // Modify the value of 'age'
            field.set(person, 30);
            System.out.println("Modified Age: " + field.get(person));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
