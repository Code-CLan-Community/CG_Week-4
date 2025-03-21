package basiclevel.TestDynamicallyCreateObjects;
import basiclevel.InvokePrivateMethod.Calculator;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
// Creating class InvokePrivateMethodTest to test our InvokePrivateMethod program
public class InvokePrivateMethodTest
{
    @Test
    void testInvokePrivateMethod()
    {
        try
        {
            // Create an instance of the Calculator class
            Calculator calculator = new Calculator();

            // Access the private method 'multiply'
            Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            method.setAccessible(true); // Make the private method accessible

            // Invoke the private method and get the result
            int result = (int) method.invoke(calculator, 5, 7);

            // Check that the result is as expected
            assertEquals(35, result);
        }
        catch (Exception e)
        {
            fail("Exception should not have been thrown: " + e.getMessage());
        }
    }
}
