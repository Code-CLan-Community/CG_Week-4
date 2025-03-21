package commonproblem.UseSuppressWarningsAnnotation;
import java.util.ArrayList;
// Creating class SuppressWarningAnnotationExample to use @SuppressWarnings("unchecked") annotation
public class SuppressWarningAnnotationExample
{
    @SuppressWarnings("unchecked")
    public void addElements()
    {
        ArrayList list = new ArrayList();
        list.add("Rajan");
        list.add("Abhishek");
        System.out.println(list);
    }

    // Main method
    public static void main(String[] args)
    {
        // Creating object of the class
        SuppressWarningAnnotationExample example = new SuppressWarningAnnotationExample();
        // Calling methods of the class
        example.addElements();
    }
}
