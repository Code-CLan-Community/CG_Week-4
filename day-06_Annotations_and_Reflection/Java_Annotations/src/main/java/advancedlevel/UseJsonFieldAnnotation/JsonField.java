package advancedlevel.UseJsonFieldAnnotation;

import java.lang.annotation.*;
// Creating custom annotation @JsonField
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonField
{
    String name();
}

