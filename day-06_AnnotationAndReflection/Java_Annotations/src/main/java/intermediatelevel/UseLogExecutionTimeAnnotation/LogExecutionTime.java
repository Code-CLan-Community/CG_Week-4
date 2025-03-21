package intermediatelevel.UseLogExecutionTimeAnnotation;

import java.lang.annotation.*;
// Creating custom Annotation LogExecutionTime
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
}

