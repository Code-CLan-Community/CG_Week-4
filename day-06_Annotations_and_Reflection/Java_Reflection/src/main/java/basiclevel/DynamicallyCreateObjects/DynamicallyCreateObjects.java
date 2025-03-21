package basiclevel.DynamicallyCreateObjects;

import java.lang.reflect.Constructor;
// Creating class DynamicallyCreateObjects
public class DynamicallyCreateObjects
{
    // Main method
    public static void main(String[] args)
    {
        try
        {
            // Dynamically create an instance of the 'Student' class
            Class<?> clazz = Class.forName("Student");
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            Object student = constructor.newInstance("Rajan", 101);

            // Cast the object to 'Student' and call the 'display' method
            Student castedStudent = (Student) student;
            castedStudent.display();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}