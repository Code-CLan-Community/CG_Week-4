package commonproblem.UseRepeatableAnnotation;
import java.lang.reflect.Method;
// Creating class RepeatableAnnotationExample to create custom annotation
public class RepeatableAnnotationExample
{
    @BugReport(description = "Null pointer exception when saving.")
    @BugReport(description = "Array index out of bounds.")
    public void trackBugs()
    {
        System.out.println("Tracking bugs.");
    }

    // Main method
    public static void main(String[] args) throws Exception
    {
        Method method = RepeatableAnnotationExample.class.getMethod("trackBugs");
        BugReports bugReports = method.getAnnotation(BugReports.class);

        for (BugReport bugReport : bugReports.value())
        {
            System.out.println("Bug : " + bugReport.description());
        }
    }
}


