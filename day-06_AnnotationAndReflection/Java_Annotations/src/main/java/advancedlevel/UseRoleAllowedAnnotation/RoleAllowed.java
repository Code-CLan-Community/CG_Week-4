package advancedlevel.UseRoleAllowedAnnotation;

import java.lang.annotation.*;
// Creating custom annotation RoleAllowed
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RoleAllowed {
    String value();
}

