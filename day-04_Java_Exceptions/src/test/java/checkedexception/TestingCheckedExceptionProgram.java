package checkedexception;

import org.junit.jupiter.api.Test;
// Creating class TestingCheckedExceptionProgram to test our program
public class TestingCheckedExceptionProgram
{
    // Test Cases
    @Test
    void f()
    {
        // Storing filepath
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_04_Java_Exceptions\\data.txt";

        CheckedException exception = new CheckedException();
        exception.readFile(filePath);
    }
}
