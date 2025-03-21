package advancedlevel.CreateCustomObjectMapper;
import java.lang.reflect.Field;
import java.util.Map;
// Creating class CreateCustomObjectMapper
public class CreateCustomObjectMapper
{
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception
    {
        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entry : properties.entrySet())
        {
            Field field = clazz.getDeclaredField(entry.getKey());
            field.setAccessible(true);
            field.set(obj, entry.getValue());
        }
        return obj;
    }
    // Main method
    public static void main(String[] args)
    {
        try
        {
            Map<String, Object> properties = Map.of(
                    "name", "Neeraj",
                    "age", 22
            );
            Person person = toObject(Person.class, properties);
            System.out.println(person);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}


