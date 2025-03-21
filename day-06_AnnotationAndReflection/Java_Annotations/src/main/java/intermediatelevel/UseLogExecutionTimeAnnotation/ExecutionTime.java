package intermediatelevel.UseLogExecutionTimeAnnotation;

import java.lang.reflect.Method;
// Creating class ExecutionTime  to measure method execution time
public class ExecutionTime
{
    @LogExecutionTime
    public void method1() throws InterruptedException {
        Thread.sleep(100);
    }

    @LogExecutionTime
    public void method2() throws InterruptedException {
        Thread.sleep(200);
    }

    // Main method
    public static void main(String[] args) throws Exception
    {
        ExecutionTime time = new ExecutionTime();
        Method[] methods = time.getClass().getDeclaredMethods();
        for (Method method : methods)
        {
            if (method.isAnnotationPresent(LogExecutionTime.class))
            {
                long startTime = System.nanoTime();
                method.invoke(time);
                long endTime = System.nanoTime();
                System.out.println("Execution time for " + method.getName() + " is " + (endTime - startTime));
            }
        }
    }
}
