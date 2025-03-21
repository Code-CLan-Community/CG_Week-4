package advancedlevel.UseRoleAllowedAnnotation;
import java.lang.reflect.Method;
// Creating class RoleBasedAccessControl to restrict method access based on roles.
public class RoleBasedAccessControl
{
    public String role;

    public RoleBasedAccessControl(String role) {
        this.role = role;
    }

    @RoleAllowed("ADMIN")
    public void adminMethod() {
        System.out.println("Admin method executed");
    }

    // Main method
    public static void main(String[] args) throws Exception
    {
        RoleBasedAccessControl accessControl = new RoleBasedAccessControl("USER");
        Method[] methods = accessControl.getClass().getDeclaredMethods();

        for (Method method : methods)
        {
            if (method.isAnnotationPresent(RoleAllowed.class))
            {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (roleAllowed.value().equals(accessControl.role))
                {
                    method.invoke(accessControl);
                }
                else
                {
                    System.out.println("Access Denied! Only " + roleAllowed.value() + " can access this method.");
                }
            }
        }
    }
}

