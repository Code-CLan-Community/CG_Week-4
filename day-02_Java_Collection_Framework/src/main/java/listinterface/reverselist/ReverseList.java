package listinterface.reverselist;

import java.util.*;
// Creating class ReverseList to reverse a list
public class ReverseList
{
    // Method to reverse list using LinkedList
    public static void reverseListUsingArrayList(List <Integer> list)
    {
        // Reversing list
        for(int i=0; i<list.size()/2; i++)
        {
            Collections.swap(list,i,(list.size())-i-1);
        }
        System.out.println("Reversed ArrayList are ");
        System.out.println(list);
    }
    // Method to reverse list using LinkedList
    public static void reverseListUsingLinkedList(List <Integer> list)
    {
        // Reversing list
        for(int i=0; i<(list.size()/2); i++)
        {
            Collections.swap(list,i,list.size()-i-1);
        }
        System.out.println("Reversed LinkedList are ");
        System.out.println(list);
    }
    // Main method
    public static void main(String[] args)
    {
        List <Integer> list1 =  new ArrayList<>();
        // Adding element to ArrayList
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        // Calling methods
        reverseListUsingArrayList(list1);

        List <Integer> list2 = new LinkedList<>();
        // Adding element to LinkedList
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        reverseListUsingLinkedList(list2);
    }
}
