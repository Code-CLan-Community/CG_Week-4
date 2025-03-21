package advancedlevel.TestJsonFieldAnnotation;
import static org.junit.jupiter.api.Assertions.*;

import advancedlevel.UseJsonFieldAnnotation.CustomSerialization;
import advancedlevel.UseJsonFieldAnnotation.User;
import org.junit.jupiter.api.Test;
// Creating class TestCustomSerialization to test our CustomSerialization class
public class TestCustomSerialization
{
    @Test
    public void testSerialize() throws IllegalAccessException
    {
        User user = new User("abhishek", 100);
        String json = CustomSerialization.serialize(user);
        String expectedJson = "{\"user_name\":\"abhishek\",\"user_age\":\"100\"}";

        assertEquals(expectedJson, json);
    }
}

