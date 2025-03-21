package beginnerlevel.AnnotationForPendingTasks;

import java.lang.reflect.Method;
// Creating class ProjectTasks  to mark pending features in a project
public class ProjectTasks
{
    @Todo(task = "Implement login functionality", assignedTo = "Rajan", priority = "HIGH")
    public void login() {
        // Pending implementation
    }

    @Todo(task = "Implement logout functionality", assignedTo = "Abhishek")
    public void logout() {
        // Pending implementation
    }

    // Main method
    public static void main(String[] args) throws Exception
    {
        Method[] methods = ProjectTasks.class.getMethods();
        for (Method method : methods)
        {
            if (method.isAnnotationPresent(Todo.class))
            {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Method : " + method.getName() + ", Task : " + todo.task() + ", Assigned To : " + todo.assignedTo() + ", Priority : " + todo.priority());
            }
        }
    }
}
