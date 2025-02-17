package repeatingwordstest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.*;

public class RepeatingWordsTest {

    @Test
    public void testRepeatingWords() {
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex);
        String input = "This is is a repeated repeated word test.";

        Matcher matcher = pattern.matcher(input);
        assertTrue(matcher.find());
        assertEquals("is", matcher.group(1));

        matcher.find();
        assertEquals("repeated", matcher.group(1));
    }
}

