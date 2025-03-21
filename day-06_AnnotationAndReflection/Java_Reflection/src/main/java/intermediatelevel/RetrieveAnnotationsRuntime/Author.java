package intermediatelevel.RetrieveAnnotationsRuntime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name();
}