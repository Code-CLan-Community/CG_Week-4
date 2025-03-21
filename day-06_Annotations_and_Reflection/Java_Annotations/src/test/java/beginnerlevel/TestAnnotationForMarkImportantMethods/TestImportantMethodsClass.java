package beginnerlevel.TestAnnotationForMarkImportantMethods;
import static org.junit.jupiter.api.Assertions.*;

import beginnerlevel.AnnotationForMarkImportantMethods.ImportantMethod;
import beginnerlevel.AnnotationForMarkImportantMethods.ImportantMethodsClass;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
// Creating class TestImportantMethodsClass to test our ImportantMethodsClass program
public class TestImportantMethodsClass
{
    @Test
    public void testAnnotations() throws Exception
    {
        Method[] methods = ImportantMethodsClass.class.getMethods();
        boolean foundCritical = false;
        boolean foundImportant = false;

        for (Method method : methods)
        {
            if (method.isAnnotationPresent(ImportantMethod.class))
            {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                if (method.getName().equals("criticalOperation") && annotation.level().equals("HIGH"))
                {
                    foundCritical = true;
                }
                if (method.getName().equals("importantOperation") && annotation.level().equals("MEDIUM"))
                {
                    foundImportant = true;
                }
            }
        }
        assertTrue(foundCritical);
        assertTrue(foundImportant);
    }
}
