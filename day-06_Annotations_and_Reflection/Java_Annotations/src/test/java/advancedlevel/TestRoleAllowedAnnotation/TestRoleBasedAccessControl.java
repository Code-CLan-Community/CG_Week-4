package advancedlevel.TestRoleAllowedAnnotation;
import static org.junit.jupiter.api.Assertions.*;

import advancedlevel.UseRoleAllowedAnnotation.RoleAllowed;
import advancedlevel.UseRoleAllowedAnnotation.RoleBasedAccessControl;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
// Creating class TestRoleBasedAccessControl to test our RoleBasedAccessControl class
public class TestRoleBasedAccessControl
{
    @Test
    public void testAdminMethodAccess() throws Exception {
        RoleBasedAccessControl adminAccess = new RoleBasedAccessControl("ADMIN");
        Method[] methods = adminAccess.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (roleAllowed.value().equals(adminAccess.role)) {
                    method.invoke(adminAccess);
                }
                else {
                    System.out.println("Access Denied! Only " + roleAllowed.value() + " can access this method.");
                }
            }
        }
    }
}


