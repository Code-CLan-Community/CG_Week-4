package advancedlevel.UseCacheResultAnnotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
// Creating class CustomCachingSystem to store method return values and avoid repeated execution.
public class CustomCachingSystem
{
    private Map<String, Object> cache = new HashMap<>();

    @CacheResult
    public int expensiveComputation(int input) {
        return input * input;
    }

    public Object invokeWithCache(Method method, Object... args) throws Exception
    {
        String key = method.getName() + args[0];
        if (cache.containsKey(key))
        {
            return cache.get(key);
        }
        else {
            Object result = method.invoke(this, args);
            cache.put(key, result);
            return result;
        }
    }

    // Main method
    public static void main(String[] args) throws Exception
    {
        CustomCachingSystem system = new CustomCachingSystem();
        Method method = system.getClass().getMethod("expensiveComputation", int.class);

        if (method.isAnnotationPresent(CacheResult.class))
        {
            System.out.println(system.invokeWithCache(method, 2));
            System.out.println(system.invokeWithCache(method, 4));
        }
    }
}
