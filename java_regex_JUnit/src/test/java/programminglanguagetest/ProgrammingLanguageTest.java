package programminglanguagetest;


import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.*;

public class ProgrammingLanguageTest {

    @Test
    public void testProgrammingLanguagesExtraction() {
        String regex = "\\b(Java|Python|JavaScript|Go|C\\+\\+|C#|Ruby|Swift|Kotlin|PHP)\\b";
        Pattern pattern = Pattern.compile(regex);
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        Matcher matcher = pattern.matcher(text);
        assertTrue(matcher.find());
        assertEquals("Java", matcher.group());

        matcher.find();
        assertEquals("Python", matcher.group());

        matcher.find();
        assertEquals("JavaScript", matcher.group());

        matcher.find();
        assertEquals("Go", matcher.group());
    }
}
