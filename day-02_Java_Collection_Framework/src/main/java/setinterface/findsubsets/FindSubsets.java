package setinterface.findsubsets;

import java.util.HashSet;
import java.util.Set;
// Creating class FindSubsets to check if one set is a subset of another
public class FindSubsets
{
    // Method to check if one set is a subset of another
    public static void subsetChecker(Set <Integer> set1, Set <Integer> set2)
    {
        int minimumSetSize = Math.min(set1.size(),set2.size());
        int countElement = 0;

        for(int element : set1)
        {
            if(set2.contains(element))
            {
                countElement++;
            }
        }

        if(minimumSetSize == countElement)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    // Main method
    public static void main(String[] args)
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        // Adding elements in set1
        set1.add(2);
        set1.add(3);
        // Adding elements in set2
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        // Calling method
        subsetChecker(set1,set2);
    }
}
