package intermediatelevel.UseMaxLengthAnnotation;
import java.lang.annotation.*;

// Creating custom annotation MaxLength
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MaxLength
{
    int value();
}
