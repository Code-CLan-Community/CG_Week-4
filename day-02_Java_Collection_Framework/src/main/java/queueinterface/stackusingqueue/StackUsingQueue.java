package queueinterface.stackusingqueue;

import java.util.*;
// Creating class StackUsingQueue to implement stack using queue

public class StackUsingQueue
{
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    // Push operation
    public void push(int value)
    {
        // Adding element into queue
        queue1.add(value);
        // Moving elements from queue1 to queue2
        while (!queue1.isEmpty())
        {
            queue2.add(queue1.poll());
        }

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Pop operation
    public int pop()
    {
        if (queue1.isEmpty())
        {
            return -1;
        }
        return queue1.poll();
    }

    // Top operation
    public int top()
    {
        if (queue1.isEmpty())
        {
            return -1;
        }
        return queue1.peek();
    }

    // Main method
    public static void main(String[] args)
    {
        // Creating object of the StackUsingQueue class
        StackUsingQueue stack = new StackUsingQueue();
        // Adding element to stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // Displaying the result
        System.out.println(stack.pop());
    }
}
