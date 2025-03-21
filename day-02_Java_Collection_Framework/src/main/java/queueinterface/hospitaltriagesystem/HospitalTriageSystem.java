package queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;
import java.util.Comparator;

// Creating class HospitalTriageSystem
public class HospitalTriageSystem
{
    // Main method
    public static void main(String[] args)
    {
        // Creating object of HospitalTriageSystem class
        PriorityQueue<Patients> patientsPriorityQueue = new PriorityQueue<>(new Comparator<Patients>()
        {
            public int compare(Patients p1, Patients p2)
            {
                return p2.severity - p1.severity;
            }
        });

        // Adding patients into priority queue
        patientsPriorityQueue.add(new Patients("John", 3));
        patientsPriorityQueue.add(new Patients("Alice", 5));
        patientsPriorityQueue.add(new Patients("Bob", 2));

        // Displaying result
        while (!patientsPriorityQueue.isEmpty())
        {
            Patients temp = patientsPriorityQueue.poll();
            System.out.print(temp.name + ", ");
        }
    }
}
