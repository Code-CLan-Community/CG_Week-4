package pipedstreams;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

// Creating class InterThreadCommunication to implement read and write operation using threads
public class InterThreadCommunication
{
    // main method
    public static void main(String[] args)
    {
        try
        {
            final PipedOutputStream pipedOutputStream = new PipedOutputStream();
            final PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);

            Thread writerThread = new Thread(() -> {
                try
                {
                    for (int i = 0; i < 10; i++)
                    {
                        pipedOutputStream.write(("Message " + i).getBytes());
                        Thread.sleep(100);
                    }
                    pipedOutputStream.close();
                } catch (IOException | InterruptedException e)
                {
                    System.out.println("An error occurred due to " + e.getMessage());
                }
            });

            Thread readerThread = new Thread(() -> {
                try
                {
                    int data;
                    while ((data = pipedInputStream.read()) != -1)
                    {
                        System.out.print((char) data);
                    }
                    pipedInputStream.close();
                }
                catch (IOException e)
                {
                    System.out.println("An error occurred due to " + e.getMessage());
                }
            });
            writerThread.start();
            readerThread.start();
        }
        catch (IOException e)
        {
            System.out.println("An error occurred due to " + e.getMessage());
        }
    }
}


