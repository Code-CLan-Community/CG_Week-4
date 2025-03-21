package intermediatelevel.DynamicMethodInvocation;

import java.lang.reflect.Method;
import java.util.Scanner;
// Creating class DynamicMethodInvocation
public class DynamicMethodInvocation
{
    // Main method
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = scanner.nextLine();
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        try
        {
            MathOperations mathOps = new MathOperations();
            Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
            int result = (int) method.invoke(mathOps, a, b);
            System.out.println("Result: " + result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            scanner.close();
        }
    }
}
