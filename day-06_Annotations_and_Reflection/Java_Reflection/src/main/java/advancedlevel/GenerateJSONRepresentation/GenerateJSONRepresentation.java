package advancedlevel.GenerateJSONRepresentation;
import java.lang.reflect.Field;
// Creating class GenerateJSONRepresentation
public class GenerateJSONRepresentation
{
    // Method that converts an object to a JSON-like strin
    public static String toJson(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        StringBuilder json = new StringBuilder();
        json.append("{");

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            json.append("\"").append(field.getName()).append("\": ");
            json.append("\"").append(field.get(obj)).append("\"");

            if (i < fields.length - 1) {
                json.append(", ");
            }
        }

        json.append("}");
        return json.toString();
    }
    // Main method
    public static void main(String[] args)
    {
        try
        {
            Person person = new Person("Rajan", 22);
            String json = toJson(person);
            System.out.println(json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

