package setinterface.checktwosetsareequal;

import java.util.HashSet;
import java.util.Set;
// Creating class CheckIfTwoSetAreEqual to check whether to sets are equal or not
public class CheckIfTwoSetAreEqual
{
    // Method to check sets are equal or not
    public static void checkEquals(Set <Integer> set1, Set <Integer> set2)
    {
        if(set1.equals(set2))
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
        set1.add(1);
        set1.add(2);
        set1.add(3);
        // Adding elements in set2
        set2.add(3);
        set2.add(2);
        set2.add(1);
        // Calling method
        checkEquals(set1,set2);
    }
}
