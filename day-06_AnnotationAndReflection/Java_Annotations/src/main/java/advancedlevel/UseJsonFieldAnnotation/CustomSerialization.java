package advancedlevel.UseJsonFieldAnnotation;
import java.lang.reflect.Field;
// Creating class CustomSerialization
public class CustomSerialization
{
    // Method  to convert object to JSON string by reading the annotations
    public static String serialize(Object obj) throws IllegalAccessException
    {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;

        for (Field field : fields)
        {
            if (field.isAnnotationPresent(JsonField.class))
            {
                if (!first) {
                    jsonBuilder.append(",");
                }
                JsonField jsonField = field.getAnnotation(JsonField.class);
                field.setAccessible(true);
                jsonBuilder.append("\"").append(jsonField.name()).append("\":");
                jsonBuilder.append("\"").append(field.get(obj)).append("\"");
                first = false;
            }
        }
        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }

    // Main method
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("abhishek", 100);
        String json = CustomSerialization.serialize(user);
        System.out.println(json);
    }
}

