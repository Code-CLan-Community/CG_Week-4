package intermediatelevel.TestMaxLengthAnnotation;
import static org.junit.jupiter.api.Assertions.*;
import intermediatelevel.UseMaxLengthAnnotation.User;
import org.junit.jupiter.api.Test;
// Creating class TestUser to test our User class
public class TestUser
{
    @Test
    public void testValidUsername() throws NoSuchFieldException {
        User user = new User("rajan");
        assertEquals("rajan", user.getUsername());
    }

    @Test
    public void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new User("abhishek12345");
        });
        assertEquals("Username exceeds maximum length", exception.getMessage());
    }
}
