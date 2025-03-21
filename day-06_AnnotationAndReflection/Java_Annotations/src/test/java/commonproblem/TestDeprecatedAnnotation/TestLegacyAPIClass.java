package commonproblem.TestDeprecatedAnnotation;
import static org.junit.jupiter.api.Assertions.*;
import commonproblem.UseDeprecatedAnnotation.LegacyAPI;
import org.junit.jupiter.api.Test;
// Creating class TestLegacyAPIClass to test our LegacyAPI class
public class TestLegacyAPIClass
{
    @Test
    public void testOldFeature() {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();
        assertTrue(true);
    }

    @Test
    public void testNewFeature() {
        LegacyAPI api = new LegacyAPI();
        api.newFeature();
        assertTrue(true);
    }
}


