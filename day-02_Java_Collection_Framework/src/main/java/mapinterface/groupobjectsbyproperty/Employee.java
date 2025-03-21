package mapinterface.groupobjectsbyproperty;

// Creating Employee class to store employee record
public class Employee
{
    // Attribute of the class
    String employeeName;
    String employeeDepartment;

    // Constructor of the class
    public Employee(String name, String department) {
        this.employeeName = name;
        this.employeeDepartment = department;
    }

    public String toString()
    {
        return employeeName;
    }
}
