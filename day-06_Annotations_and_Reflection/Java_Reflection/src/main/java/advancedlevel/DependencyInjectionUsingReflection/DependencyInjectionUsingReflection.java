package advancedlevel.DependencyInjectionUsingReflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
// Creating class DependencyInjectionUsingReflection
public class DependencyInjectionUsingReflection
{
    // Method to inject dependencies
    public static void injectDependencies(Object obj) throws Exception {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields)
        {
            if (field.isAnnotationPresent(Inject.class))
            {
                field.setAccessible(true);
                Object dependency = createInstance(field.getType());
                field.set(obj, dependency);
            }
        }
    }

    // Method to create instance
    public static Object createInstance(Class<?> clazz) throws Exception
    {
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }
    // Main method
    public static void main(String[] args) throws Exception
    {
        Client client = new Client();
        injectDependencies(client);
        client.performAction();
    }
}





