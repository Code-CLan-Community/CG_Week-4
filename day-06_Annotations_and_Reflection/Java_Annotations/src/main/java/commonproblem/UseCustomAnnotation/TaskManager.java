package commonproblem.UseCustomAnnotation;
import java.lang.reflect.Method;
// Creating class TaskManager to create custom Annotation
public class TaskManager
{
    @TaskInfo(priority = 2, assignedTo = "Rajan")
    public void completeTask()
    {
        System.out.println("Task completed.");
    }

    // Main method
    public static void main(String[] args) throws Exception
    {
        // Creating object of the class
        TaskManager manager = new TaskManager();
        // Calling methods of the class
        manager.completeTask();

        Method method = TaskManager.class.getMethod("completeTask");
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        //Displaying result
        System.out.println("Priority: " + taskInfo.priority());
        System.out.println("Assigned To: " + taskInfo.assignedTo());
    }
}
