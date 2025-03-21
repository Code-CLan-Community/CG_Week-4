package setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference
{
    public static void findDifference(Set <Integer> set1, Set <Integer> set2)
    {
        Set <Integer> removeElementSet = new HashSet<>();

        for(int element : set1)
        {
            if(set2.contains(element))
            {
                removeElementSet.add(element);
            }
        }
        set1.addAll(set2);
        set1.removeAll(removeElementSet);
        System.out.println("Symmetric Difference is " + set1);
    }
    // Main method
    public static void main(String[] args)
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        // Adding elements in set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        // Adding elements in set2
        set2.add(3);
        set2.add(4);
        set2.add(5);
        // Calling method
        findDifference(set1,set2);
    }
}
