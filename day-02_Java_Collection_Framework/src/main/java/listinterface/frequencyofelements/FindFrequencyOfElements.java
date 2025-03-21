package listinterface.frequencyofelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// Creating class FindFrequencyOfElements to find frequency of each element
public class FindFrequencyOfElements
{
    // Method to count frequency of each element
    public static void frequencyCount(List<String> list)
    {
        HashMap<String, Integer> map = new HashMap<>();
        for(String element : list)
        {
            if(map.containsKey(element))
            {
                map.put(element, map.get(element)+1);
            }
            else
            {
                map.put(element,1);
            }
        }
        System.out.println(map);
    }
    // Main method
    public static void main(String[] args)
    {
        List <String> list = new ArrayList<>();
        // Adding elements to list
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        // Calling method
        frequencyCount(list);
    }
}
