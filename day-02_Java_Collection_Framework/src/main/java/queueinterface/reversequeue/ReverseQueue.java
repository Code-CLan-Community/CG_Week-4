package queueinterface.reversequeue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
// Creating class ReverseQueue to reverse a queue
public class ReverseQueue
{
    // Method to reverse a queue
    public static  Queue <Integer> reverseQueue(Queue <Integer> queue)
    {
        Stack <Integer> stack = new Stack<>();
        // Adding queue element in stack
        while(!queue.isEmpty())
        {
            stack.push(queue.poll());
        }
        // Adding stack element in queue
        while(!stack.isEmpty())
        {
            queue.add(stack.pop());
        }
        return queue;
    }
    // Main method
    public static void main(String[] args)
    {
        Queue <Integer> queue = new LinkedList<>();
        // Adding elements in queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        // Calling reverseQueue method
        queue = reverseQueue(queue);
        System.out.println(queue);
    }
}
