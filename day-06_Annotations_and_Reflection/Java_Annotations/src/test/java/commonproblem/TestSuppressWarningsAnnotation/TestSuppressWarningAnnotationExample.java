package commonproblem.TestSuppressWarningsAnnotation;
import static org.junit.jupiter.api.Assertions.*;
import commonproblem.UseSuppressWarningsAnnotation.SuppressWarningAnnotationExample;
import org.junit.jupiter.api.Test;
// Creating class TestSuppressWarningAnnotationExample to test our SuppressWarningAnnotationExample class
public class TestSuppressWarningAnnotationExample
{
    @Test
    public void testAddElements()
    {
        SuppressWarningAnnotationExample example = new SuppressWarningAnnotationExample();
        example.addElements();
        assertTrue(true);
    }
}


