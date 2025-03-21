package serialization;
import java.io.*;
// Creating class Employee that implements Serializable interface
public class Employee implements Serializable
{
    // Attribute of the class
    int employeeId;
    String employeeName;
    String employeeDepartment;
    double employeeSalary;

    // Constructor to initialize employee details
    public Employee(int id, String name, String department, double salary)
    {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeDepartment = department;
        this.employeeSalary = salary;
    }

    @Override
    public String toString()
    {
        return "ID " + employeeId + ", Name " + employeeName + ", Department " + employeeDepartment + ", Salary " + employeeSalary;
    }
}