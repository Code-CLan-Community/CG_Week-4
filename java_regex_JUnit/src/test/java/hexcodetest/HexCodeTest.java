package hexcodetest;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.*;

public class HexCodeTest {
    @Test
    public void testHexCode() {
        String regex = "^#[A-Fa-f0-9]{6}$";  // Fixed regex
        Pattern pattern = Pattern.compile(regex);
        String input = "#ff4500";
        Matcher matcher = pattern.matcher(input);
        assertTrue(matcher.matches(), "Hex code should match the regex pattern");
    }
}
