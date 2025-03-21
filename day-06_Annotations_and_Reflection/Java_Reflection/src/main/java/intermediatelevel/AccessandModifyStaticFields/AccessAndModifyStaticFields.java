package intermediatelevel.AccessandModifyStaticFields;
import java.lang.reflect.Field;
// Creating class AccessAndModifyStaticFields
public class AccessAndModifyStaticFields
{
    // Main method
    public static void main(String[] args)
    {
        try
        {
            // Access the private static field 'API_KEY'
            Field field = Configuration.class.getDeclaredField("API_KEY");
            field.setAccessible(true); // Make the private static field accessible

            // Print the original value of 'API_KEY'
            System.out.println("Original API_KEY: " + Configuration.getApiKey());

            // Modify the value of 'API_KEY'
            field.set(null, "NewAPIKey");
            System.out.println("Modified API_KEY: " + Configuration.getApiKey());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
