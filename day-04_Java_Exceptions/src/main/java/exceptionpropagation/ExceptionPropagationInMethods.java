package exceptionpropagation;
// Creating class ExceptionPropagationInMethods
public class ExceptionPropagationInMethods
{
    // Method 1 throwing Arithmetic exception
    public static void method1() throws ArithmeticException
    {
        throw new ArithmeticException(String.valueOf(10 / 0));
    }
    // Method 2 calling method 1
    public static void method2()
    {
        method1();
    }
    // Main method
    public static void main(String[] args)
    {
        // Handling Arithmetic exception
        try
        {
             method2();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Handled exception in main");
        }
    }
}
