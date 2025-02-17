package basicjunittesting.calculatortest.filehandlingtest;


import basicJunitproblems.calculator.filehandling.FileProcessor;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;

public class FileProcessorTest {

    private final FileProcessor fileProcessor = new FileProcessor();

    @Test
    public void testWriteToFileAndReadCorrectly() throws IOException {
        String filename = "testFile.txt";
        String content = "Hello, JUnit!";

        // Write to file
        fileProcessor.writeToFile(filename, content);

        // Read from file
        String readContent = fileProcessor.readFromFile(filename);

        // Verify the content
        assertEquals(content, readContent);

        // Clean file after the test
        new File(filename).delete();
    }

    @Test
    public void testFileExistsAfterWriting() throws IOException {
        String filename = "testFile.txt";
        String content = "File existence test.";

        // Write to file
        fileProcessor.writeToFile(filename, content);

        // Checks file exists
        File file = new File(filename);
        assertTrue(file.exists());

        // Clean file after the test
        file.delete();
    }

    @Test(expected = IOException.class)
    public void testIOExceptionWhenFileDoesNotExist() throws IOException {
        // Try reading a non-existent file
        String filename = "nonExistentFile.txt";
        fileProcessor.readFromFile(filename);
    }
}

