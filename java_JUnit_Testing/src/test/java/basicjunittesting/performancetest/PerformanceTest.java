package basicjunittesting.calculatortest.performancetest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import basicJunitproblems.calculator.performance.Performance;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

    public class PerformanceTest {

        private final Performance performanceUtils = new Performance();

        @Test
        @Timeout(value = 2, unit = TimeUnit.SECONDS)  // Timeout in seconds (JUnit 5)
        public void testLongRunningTaskTimeout() throws InterruptedException {
            assertEquals("Task Completed", performanceUtils.longRunningTask());
        }
    }
