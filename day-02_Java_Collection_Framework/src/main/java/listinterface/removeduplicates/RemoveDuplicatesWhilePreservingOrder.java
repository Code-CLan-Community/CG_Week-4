package listinterface.removeduplicates;

import java.util.ArrayList;
import java.util.List;
// Creating class RemoveDuplicatesWhilePreservingOrder to remove duplicate elements from list while preserving order
public class RemoveDuplicatesWhilePreservingOrder
{
    // Method to remove duplicates
    public static void removeDuplicates(List <Integer> list)
    {
        List <Integer> newList = new ArrayList<>();

        for(int element : list)
        {
            if(!newList.contains(element))
            {
                newList.add(element);
            }
        }

        System.out.println(newList);
    }
    // Main method
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        // Adding element to list
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        // Calling method
        removeDuplicates(list);
    }
}
