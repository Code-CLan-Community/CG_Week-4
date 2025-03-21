package advancelevel.TestCreateCustomObjectMapper;
import advancedlevel.CreateCustomObjectMapper.CreateCustomObjectMapper;
import org.junit.jupiter.api.Test;
import java.util.Map;
public class CreateCustomObjectMapperTest
{
    @Test
    void testToObject() {
        try {
            // Create a map with properties
            Map<String, Object> properties = Map.of(
                    "name", "Rajan",
                    "age", 22
            );
            CreateCustomObjectMapper.main(new String[]{});
        }
        catch (Exception e)
        {
            System.out.println("Exception should not have been thrown: " + e.getMessage());
        }
    }
}
