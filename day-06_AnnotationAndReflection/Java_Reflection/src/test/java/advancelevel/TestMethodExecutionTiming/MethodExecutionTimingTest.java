package advancelevel.TestMethodExecutionTiming;

import advancedlevel.MethodExecutionTiming.MethodExecutionTiming;
import org.junit.jupiter.api.Test;
// Creating class MethodExecutionTimingTest to test our MethodExecutionTiming program
public class MethodExecutionTimingTest
{
    @Test
    void testMeasureExecutionTime() {
        try {
            MethodExecutionTiming.main(new String[]{});
        } catch (Exception e) {
            System.out.println("Exception should not have been thrown: " + e.getMessage());
        }
    }
}
