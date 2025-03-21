package commonproblem.TestRepeatableAnnotation;
import static org.junit.jupiter.api.Assertions.*;
import commonproblem.UseRepeatableAnnotation.BugReports;
import commonproblem.UseRepeatableAnnotation.RepeatableAnnotationExample;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
// Creating class TestRepeatableAnnotationExample to test our RepeatableAnnotationExample program
public class TestRepeatableAnnotationExample
{
    @Test
    public void testTrackBugs() {
        RepeatableAnnotationExample example = new RepeatableAnnotationExample();
        example.trackBugs();
        assertTrue(true);
    }

    @Test
    public void testBugReportsAnnotation() throws Exception {
        Method method = RepeatableAnnotationExample.class.getMethod("trackBugs");
        BugReports bugReports = method.getAnnotation(BugReports.class);
        assertEquals(2, bugReports.value().length);
    }
}


