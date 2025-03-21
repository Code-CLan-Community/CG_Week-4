package advancedlevel.TestCacheResultAnnotation;
import static org.junit.jupiter.api.Assertions.*;

import advancedlevel.UseCacheResultAnnotation.CacheResult;
import advancedlevel.UseCacheResultAnnotation.CustomCachingSystem;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
// Creating class TestCustomCachingSystem to test our CustomCachingSystem class
public class TestCustomCachingSystem
{
    @Test
    public void testCacheResult() throws Exception {
        CustomCachingSystem system = new CustomCachingSystem();
        Method method = system.getClass().getMethod("expensiveComputation", int.class);

        if (method.isAnnotationPresent(CacheResult.class)) {
            Object result1 = system.invokeWithCache(method, 2);
            Object result2 = system.invokeWithCache(method, 2);
            assertEquals(result1, result2); // Should return cached result
        }
    }
}

