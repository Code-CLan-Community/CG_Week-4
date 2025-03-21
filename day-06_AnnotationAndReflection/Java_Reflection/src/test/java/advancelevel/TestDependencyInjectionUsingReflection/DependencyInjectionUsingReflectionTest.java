package advancelevel.TestDependencyInjectionUsingReflection;
import advancedlevel.DependencyInjectionUsingReflection.*;
import org.junit.jupiter.api.Test;
// Creating class DependencyInjectionUsingReflectionTest to test our DependencyInjectionUsingReflection program
public class DependencyInjectionUsingReflectionTest
{
    @Test
    void testInjectDependencies()
    {
        try
        {
           DependencyInjectionUsingReflection.main(new String[]{});
        }
        catch (Exception e)
        {
            System.out.println("Exception should not have been thrown: " + e.getMessage());
        }
    }
}
