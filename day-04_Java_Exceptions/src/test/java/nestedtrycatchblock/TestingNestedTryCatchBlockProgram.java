package nestedtrycatchblock;

import org.junit.jupiter.api.Test;
// Creating class TestingTryWithResourcesProgram to test our program
public class TestingNestedTryCatchBlockProgram
{
    // Test Cases
    @Test
    void testResult()
    {
        int[] arr = {1,2,3,4,5};
        NestedTryCatchBlock.arrayDivision(arr,2,3);
    }

    @Test
    void testArithmeticException()
    {
        int[] arr = {1,2,3,4,5};
        NestedTryCatchBlock.arrayDivision(arr,0,3);
    }

    @Test
    void testArrayIndexOutOfBoundsException()
    {
        int[] arr = {1,2,3,4,5};
        NestedTryCatchBlock.arrayDivision(arr,2,10);
    }
}
