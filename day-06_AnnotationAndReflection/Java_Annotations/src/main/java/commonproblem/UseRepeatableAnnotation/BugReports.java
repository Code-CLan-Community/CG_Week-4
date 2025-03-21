package commonproblem.UseRepeatableAnnotation;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BugReports
{
    BugReport[] value();
}