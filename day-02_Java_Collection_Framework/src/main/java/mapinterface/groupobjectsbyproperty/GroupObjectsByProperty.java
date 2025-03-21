package mapinterface.groupobjectsbyproperty;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

// Creating class GroupObjectsByProperty to group object based on their property
public class GroupObjectsByProperty
{
    // method to group objects by property
    public static Map<String, List<Employee>> groupByProperty(List<Employee> employees)
    {
        Map<String, List<Employee>> newmap = new HashMap<>();

        for (Employee employee : employees)
        {
            newmap.computeIfAbsent(employee.employeeDepartment, k -> new ArrayList<>()).add(employee);
        }
        return newmap;
    }

    // Main method
    public static void main(String[] args)
    {
        // Creating objets of employee class
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        // Calling method and displaying the result
        Map<String, List<Employee>> map = groupByProperty(employees);
        System.out.println(map);
    }
}
