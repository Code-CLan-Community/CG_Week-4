package setinterface.unionandintersectionoftwosets;

import java.util.HashSet;
import java.util.Set;
// Creating class UnionAndIntersectionOfTwoSets to find union and intersection of two sets
public class UnionAndIntersectionOfTwoSets
{
    // Method to find union of two sets
    public static void unionOfSets(Set <Integer> set1, Set <Integer> set2)
    {
        Set <Integer> newSet = new HashSet<>();
        newSet.addAll(set1);
        newSet.addAll(set2);
        System.out.println("Union is ");
        System.out.println(newSet);
    }
    // Method to find intersection of two sets
    public static void intersectionofSets(Set <Integer> set1, Set <Integer> set2)
    {
        Set <Integer> newSet = new HashSet<>();
        for(int elements : set1)
        {
            if(set2.contains(elements))
            {
                newSet.add(elements);
            }
        }
        System.out.println("Intersection is ");
        System.out.println(newSet);
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
        set2.add(5);
        set2.add(6);
        // Calling method
        unionOfSets(set1,set2);
        intersectionofSets(set1,set2);
    }
}
