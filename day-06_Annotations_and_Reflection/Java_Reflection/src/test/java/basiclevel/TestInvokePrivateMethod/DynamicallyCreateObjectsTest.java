package basiclevel.TestInvokePrivateMethod;
import basiclevel.DynamicallyCreateObjects.Student;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;
import static org.junit.jupiter.api.Assertions.*;
// Creating class GetClassInformationTest to test our GetClassInformation program
public class DynamicallyCreateObjectsTest
{
    @Test
    void testCreateInstanceDynamically() {
        try {
            // Dynamically create an instance of the 'Student' class
            Class<?> clazz = Class.forName("Student");
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            Object student = constructor.newInstance("Rajan", 101);

            // Cast the object to 'Student'
            Student castedStudent = (Student) student;

            // Ensure the 'display' method works as expected
            castedStudent.display();
        } catch (Exception e)
        {
            System.out.println("Exception should not have been thrown: " + e.getMessage());
        }
    }
}
