package finallyblockexecution;

import org.junit.jupiter.api.Test;

// Creating class TestingFinallyBlockExecutionProgram to test our program
public class TestingFinallyBlockExecutionProgram
{
    // Test Cases
    @Test
    void testDivision()
    {
        FinallyBlockExecution.division(4,2);
    }

    @Test
    void testArithmeticException()
    {
        FinallyBlockExecution.division(4,0);
    }
}
