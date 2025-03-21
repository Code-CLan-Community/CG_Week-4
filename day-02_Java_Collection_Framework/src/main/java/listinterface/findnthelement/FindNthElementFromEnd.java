package listinterface.findnthelement;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Creating class FindNthElementFromEnd to find nth element from last
public class FindNthElementFromEnd
{
    // Method to find nth element
    public static void nthelement(List <Character> list, int n)
    {
        Collections.reverse(list);
        System.out.println(list.get(n-1));
    }

    // Main method
    public static void main(String[] args)
    {
        List <Character> list = new LinkedList<>();
        // Adding element to list
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        // Calling method
        nthelement(list,2);
    }
}
