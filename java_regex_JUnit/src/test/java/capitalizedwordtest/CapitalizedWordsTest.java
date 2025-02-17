package capitalizedwordtest;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.*;


public class CapitalizedWordsTest {
    @Test
    public void testCapitalizedWords() {
        String regex = "\\b[A-Z][a-z]*\\b";  // Fixed regex
        Pattern pattern = Pattern.compile(regex);
        String input = "The Eiffel Tower is in Paris and the Statue of Liberty is in NEW YORK";
        Matcher matcher = pattern.matcher(input);
        assertTrue(matcher.find(), "Capitalized words should match the regex pattern");
    }
}
