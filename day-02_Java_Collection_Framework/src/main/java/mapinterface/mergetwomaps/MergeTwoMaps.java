package mapinterface.mergetwomaps;
import java.util.HashMap;
import java.util.Map;
// Creating class MergeTwoMaps to merge two maps
public class MergeTwoMaps
{
    // Method to merge two maps
    public static Map <String, Integer> mergingMaps(Map<String, Integer> map1, Map<String, Integer> map2)
    {
        Map <String, Integer> mergedMap = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet())
        {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return mergedMap;
    }

    // Main method
    public static void main(String[] args)
    {
        Map <String, Integer> map1 = new HashMap<>();
        // Adding element in map1
        map1.put("A", 1);
        map1.put("B", 2);

        Map <String, Integer> map2 = new HashMap<>();
        // Adding element in map2
        map2.put("B", 3);
        map2.put("C", 4);
        // Calling method
        Map <String, Integer> mergedMap = mergingMaps(map1, map2);
        System.out.println(mergedMap);
    }
}

