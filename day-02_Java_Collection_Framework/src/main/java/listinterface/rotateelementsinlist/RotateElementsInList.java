package listinterface.rotateelementsinlist;

import java.util.ArrayList;
import java.util.List;
// Creating class RotateElementsInList to rotate element in list
public class RotateElementsInList
{
    // Method to rotate elements
    public static void rotatingElements(List<Integer> list,int rotationPoint)
    {
        List <Integer> newList = new ArrayList<>();

        for(int i=rotationPoint;i<list.size();i++)
        {
            newList.add(list.get(i));
        }

        for (int i=0; i<rotationPoint; i++)
        {
            newList.add(list.get(i));
        }

        System.out.println(newList);
    }
    // Main method
    public static void main(String[] args)
    {
        List <Integer> list = new ArrayList<>();
        int rotationPoint = 2;
        // Adding element to list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // Calling method
        rotatingElements(list,rotationPoint);
    }
}
