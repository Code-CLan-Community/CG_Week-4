package mapinterface.invertamap;
import java.util.*;
// Creating class InvertMap to invert the map
public class InvertMap
{
    // Method to invert the map
    public static Map<Integer, List<String>> invertingMap(Map<String , Integer> map)
    {
        Map<Integer, List<String>> newMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            newMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return newMap;
    }
    // Main method
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        // Adding elements in map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        // Calling method
        Map<Integer, List<String>> newMap = invertingMap(map);
        // Displaying the inverted map
        System.out.println(newMap);
    }
}
