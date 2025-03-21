package advancelevel.TestGenerateJSONRepresentation;
import org.junit.jupiter.api.Test;
import advancedlevel.GenerateJSONRepresentation.*;
// Creating class GenerateJSONRepresentationTest to test our GenerateJSONRepresentation program
public class GenerateJSONRepresentationTest
{
    @Test
    void testToJson()
    {
        try
        {
            GenerateJSONRepresentation.main(new String[]{});
        }
        catch (Exception e)
        {
            System.out.println("Exception should not have been thrown: " + e.getMessage());
        }
    }
}

