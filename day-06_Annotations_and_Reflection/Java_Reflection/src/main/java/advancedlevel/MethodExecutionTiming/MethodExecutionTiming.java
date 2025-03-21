package advancedlevel.MethodExecutionTiming;
import intermediatelevel.DynamicMethodInvocation.MathOperations;
import java.lang.reflect.Method;
// Creating class MethodExecutionTiming
public class MethodExecutionTiming
{
    // Method to measure execution time
    public static void measureExecutionTime(Object obj, String methodName, Object... args) throws Exception
    {
        Method method = obj.getClass().getMethod(methodName, int.class, int.class);
        long startTime = System.nanoTime();
        method.invoke(obj, args);
        long endTime = System.nanoTime();
        System.out.println("Execution time of " + methodName + ": " + (endTime - startTime) + " ns");
    }
    // Main method
    public static void main(String[] args) throws Exception
    {
        MathOperations mathOps = new MathOperations();
        measureExecutionTime(mathOps, "add", 5, 3);
        measureExecutionTime(mathOps, "subtract", 5, 3);
        measureExecutionTime(mathOps, "multiply", 5, 3);
    }
}
