package basicjunittesting.calculatortest.exceptionhandelingtest;

import static org.junit.jupiter.api.Assertions.*;
import basicJunitproblems.calculator.exceptionhandeling.ExceptionHandling;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {
    private final ExceptionHandling calculator = new ExceptionHandling();

    @Test
    public void testDivideByZeroException() {
        try {
            calculator.divide(5, 0);
            fail("Expected ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}