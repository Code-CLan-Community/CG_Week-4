package basiclevel.TestAccessPrivateField;
import basiclevel.AccessPrivateField.Person;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

// Creating class AccessPrivateFieldTest to test our AccessPrivateField program
public class AccessPrivateFieldTest
{
    @Test
    void testAccessAndModifyPrivateField() {
        try
        {
            // Create a Person instance
            Person person = new Person(25);

            // Access the private field 'age'
            Field field = Person.class.getDeclaredField("age");
            field.setAccessible(true); // Make the private field accessible

            // Get the original value of 'age'
            int originalAge = (int) field.get(person);
            assertEquals(25, originalAge);

            // Modify the value of 'age'
            field.set(person, 30);

            // Get the modified value of 'age'
            int modifiedAge = (int) field.get(person);
            assertEquals(30, modifiedAge);
        }
        catch (Exception e)

        {
            fail("Exception should not have been thrown: " + e.getMessage());
        }
    }
}
