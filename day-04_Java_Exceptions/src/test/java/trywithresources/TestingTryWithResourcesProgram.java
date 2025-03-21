package trywithresources;

import org.junit.jupiter.api.Test;

// Creating class TestingTryWithResourcesProgram to test our program
public class TestingTryWithResourcesProgram
{
    // Test Cases
    @Test
    void testReadFile()
    {
        TryWithResources.readFile("D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_04_Java_Exceptions\\data.txt");
    }

    @Test
    void testIOException()
    {
        TryWithResources.readFile("D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_04_Java_Exceptions\\da.txt");
    }
}
