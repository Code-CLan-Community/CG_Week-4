package multiplecatchblocks;
import org.junit.jupiter.api.Test;
// Creating class TestingMultipleCatchBlocksProgram to test our program
public class TestingMultipleCatchBlocksProgram
{
    // Test Cases
    @Test
    void testFindTarget()
    {
        int[] arr = {1,2,3,4,5};
        MultipleCatchBlocks.findTarget(arr,2);
    }

    @Test
    void testArrayIndexOutOfBoundsException()
    {
        int[] arr = {1,2,3,4,5};
        MultipleCatchBlocks.findTarget(arr,7);
    }

    @Test
    void testNullPointerException()
    {
        int[] arr = null;
        MultipleCatchBlocks.findTarget(arr,7);
    }
}
