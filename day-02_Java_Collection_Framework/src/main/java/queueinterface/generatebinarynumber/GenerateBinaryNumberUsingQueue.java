package queueinterface.generatebinarynumber;
import java.util.LinkedList;
import java.util.Queue;
// Creating class GenerateBinaryNumberUsingQueue to generate binary number
public class GenerateBinaryNumberUsingQueue
{
    // Method to generate binary number
    public static void generateBinaryNumbers(int num)
    {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < num; i++)
        {
            String temp = queue.poll();
            System.out.print(temp + " ");
            queue.add(temp + "0");
            queue.add(temp + "1");
        }
    }
    // Main Method
    public static void main(String[] args)
    {
        int num = 5;
        generateBinaryNumbers(num);
    }
}

