package setinterface.convertsettosortedlist;

import java.util.*;
// Creating class ConvertSetIntoSortedList to convert set into list
public class ConvertSetIntoSortedList
{
    // Method to convert set into list
    public static void setIntoList(Set <Integer> set)
    {
        List<Integer> list = new ArrayList<>();
        // Adding set element into list
        list.addAll(set);
        Collections.sort(list);

        System.out.println("List is " + list);
    }
    // Main Method
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<>();
        // Adding elements in set
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);
        // Calling method
        setIntoList(set);
    }
}
