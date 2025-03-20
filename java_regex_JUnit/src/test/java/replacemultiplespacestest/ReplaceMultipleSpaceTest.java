package replacemultiplespacestest;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.*;

public class ReplaceMultipleSpaceTest {

    @Test
    public void testReplaceMultipleSpaces() {
        String text = "This   is   an  example   with   multiple   spaces.";
        String regex = "\\s+";

        String replacedText = text.replaceAll(regex, " ");
        assertEquals("This is an example with multiple spaces.", replacedText);
    }
}

