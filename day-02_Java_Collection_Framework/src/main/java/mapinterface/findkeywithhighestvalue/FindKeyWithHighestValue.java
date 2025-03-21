package mapinterface.findkeywithhighestvalue;
import java.util.HashMap;
import java.util.Map;
// Creating class FindKeyWithHighestValue to find max value in map
public class FindKeyWithHighestValue
{
    // Method to find max value
    public static String findKeyWithHighestValue(Map<String, Integer> map)
    {
        String maximumKeyElement = null;
        int maximumValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            if (entry.getValue() > maximumValue)
            {
                maximumValue = entry.getValue();
                maximumKeyElement = entry.getKey();
            }
        }
        return maximumKeyElement;
    }
    // Main method
    public static void main(String[] args)
    {
        Map <String, Integer> map = new HashMap<>();
        // Adding elements in map
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        // Calling method
        String keyWithMaxValue = findKeyWithHighestValue(map);
        System.out.println(keyWithMaxValue);
    }
}

