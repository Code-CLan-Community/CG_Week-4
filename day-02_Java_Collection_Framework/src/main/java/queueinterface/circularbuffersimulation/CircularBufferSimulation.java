package queueinterface.circularbuffersimulation;

// Creating class CircularBufferSimulation to simulate circular buffering
public class CircularBufferSimulation
{
    // Attribute of the class
    final private int[] buffer;
    private int head;
    private int tail;
    private int size;

    // Parameterized Constructor of the class
    public CircularBufferSimulation(int capacity)
    {
        buffer = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Inserting element to circular buffer
    public void insert(int value)
    {
        buffer[tail] = value;
        tail = (tail + 1) % buffer.length;

        if (size < buffer.length)
        {
            size++;
        }
        else
        {
            head = (head + 1) % buffer.length;
        }
    }

    // Printing circular Buffer
    public void printBuffer()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(buffer[(head + i) % buffer.length] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args)
    {
        // Creating objects of CircularBufferSimulation class
        CircularBufferSimulation circularBufferSimulation = new CircularBufferSimulation(3);
        //Adding value to circular buffer
        circularBufferSimulation.insert(1);
        circularBufferSimulation.insert(2);
        circularBufferSimulation.insert(3);
        circularBufferSimulation.printBuffer();
        // Adding value to circular buffer
        circularBufferSimulation.insert(4);
        circularBufferSimulation.printBuffer();
    }
}
