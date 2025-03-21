package basiclevel.InvokePrivateMethod;
import java.lang.reflect.Method;
// Creating class InvokePrivateMethod
public class InvokePrivateMethod
{
    // Main method
    public static void main(String[] args)
    {
        try
        {
            Calculator calculator = new Calculator();

            // Access the private method 'multiply'
            Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            // Make the private method accessible
            method.setAccessible(true);

            // Invoke the private method and print the result
            int result = (int) method.invoke(calculator, 4,2);
            System.out.println("Result of multiply: " + result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

