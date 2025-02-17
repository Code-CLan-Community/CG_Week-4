package badwordstest;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.*;

public class BadWordsTest {

    @Test
    public void testBadWordsReplacement() {
        String text = "This is a damn bad example with some stupid words.";
        String regex = "\\b(damn|stupid)\\b";
        String replacement = "****";

        String replacedText = text.replaceAll(regex, replacement);
        assertEquals("This is a **** bad example with some **** words.", replacedText);
    }
}

