package basiclevel.DynamicallyCreateObjects;
// Creating class Student
public class Student
{
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber)
    {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void display()
    {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
    }
}
