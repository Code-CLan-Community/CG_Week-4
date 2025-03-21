package intermediatelevel.TestAccessAndModifyStaticFields;
import intermediatelevel.AccessandModifyStaticFields.Configuration;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;
// Creating class AccessAndModifyStaticFieldsTest to test our AccessAndModifyStaticFields program
public class AccessAndModifyStaticFieldsTest
{
    @Test
    void testAccessAndModifyStaticField()
    {
        try
        {
            // Access the private static field 'API_KEY'
            Field field = Configuration.class.getDeclaredField("API_KEY");
            field.setAccessible(true); // Make the private static field accessible

            // Get the original value of 'API_KEY'
            String originalApiKey = (String) field.get(null);
            assertEquals("OriginalAPIKey", originalApiKey);

            // Modify the value of 'API_KEY'
            field.set(null, "NewAPIKey");

            // Get the modified value of 'API_KEY'
            String modifiedApiKey = (String) field.get(null);
            assertEquals("NewAPIKey", modifiedApiKey);
        }
        catch (Exception e)
        {
            System.out.println("Exception should not have been thrown: " + e.getMessage());
        }
    }
}
