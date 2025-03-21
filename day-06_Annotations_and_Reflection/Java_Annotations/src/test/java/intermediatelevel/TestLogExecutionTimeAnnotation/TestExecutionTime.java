package intermediatelevel.TestLogExecutionTimeAnnotation;

import static org.junit.jupiter.api.Assertions.*;

import intermediatelevel.UseLogExecutionTimeAnnotation.ExecutionTime;
import intermediatelevel.UseLogExecutionTimeAnnotation.LogExecutionTime;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
public class TestExecutionTime
{
    @Test
    public void testMethodExecutionTime() throws Exception {
        ExecutionTime time = new ExecutionTime();
        Method[] methods = time.getClass().getDeclaredMethods();

        for (Method method : methods)
        {
            if (method.isAnnotationPresent(LogExecutionTime.class))
            {
                long startTime = System.nanoTime();
                method.invoke(time);
                long endTime = System.nanoTime();
                long executionTime = endTime - startTime;

                System.out.println("Execution time for " + method.getName() + " is " + executionTime + "ns");
                assertTrue(executionTime > 0);
            }
        }
    }
}

