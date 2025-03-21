package beginnerlevel.AnnotationForMarkImportantMethods;

import java.lang.annotation.*;
// Creating custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ImportantMethod
{
    String level() default "HIGH";
}
