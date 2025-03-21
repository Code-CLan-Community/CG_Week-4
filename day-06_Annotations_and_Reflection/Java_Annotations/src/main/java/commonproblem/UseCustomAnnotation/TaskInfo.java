package commonproblem.UseCustomAnnotation;
import java.lang.annotation.*;
// Creating custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TaskInfo
{
    int priority() default 1;
    String assignedTo();
}





