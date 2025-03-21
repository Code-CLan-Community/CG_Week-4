package beginnerlevel.TestAnnotationForPendingTasks;
import static org.junit.jupiter.api.Assertions.*;
import beginnerlevel.AnnotationForPendingTasks.ProjectTasks;
import beginnerlevel.AnnotationForPendingTasks.Todo;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

// Creating class TestProjectTasks to test our ProjectTasks class
public class TestProjectTasks
{
    @Test
    public void testTodoAnnotations() throws Exception
    {
        Method[] methods = ProjectTasks.class.getMethods();
        boolean foundLogin = false;
        boolean foundLogout = false;

        for (Method method : methods)
        {
            if (method.isAnnotationPresent(Todo.class))
            {
                Todo todo = method.getAnnotation(Todo.class);
                if (method.getName().equals("login") && todo.task().equals("Implement login functionality") && todo.assignedTo().equals("Rajan") && todo.priority().equals("HIGH")) {
                    foundLogin = true;
                }
                if (method.getName().equals("logout") && todo.task().equals("Implement logout functionality") && todo.assignedTo().equals("Abhishek") && todo.priority().equals("MEDIUM")) {
                    foundLogout = true;
                }
            }
        }
        assertTrue(foundLogin);
        assertTrue(foundLogout);
    }
}


