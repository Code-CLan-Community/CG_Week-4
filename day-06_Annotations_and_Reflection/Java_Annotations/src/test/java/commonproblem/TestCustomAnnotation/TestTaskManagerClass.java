package commonproblem.TestCustomAnnotation;
import static org.junit.jupiter.api.Assertions.*;

import commonproblem.UseCustomAnnotation.TaskInfo;
import commonproblem.UseCustomAnnotation.TaskManager;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
// Creating class TestTaskManagerClass to test our TaskManager class
public class TestTaskManagerClass
{
    @Test
    public void testTaskInfoAnnotation() throws Exception {
        Method method = TaskManager.class.getMethod("completeTask");
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
        assertEquals(2, taskInfo.priority());
        assertEquals("Rajan", taskInfo.assignedTo());
    }
}
