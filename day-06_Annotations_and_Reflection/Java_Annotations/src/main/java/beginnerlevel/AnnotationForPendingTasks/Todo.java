package beginnerlevel.AnnotationForPendingTasks;

import java.lang.annotation.*;
// Creating custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

