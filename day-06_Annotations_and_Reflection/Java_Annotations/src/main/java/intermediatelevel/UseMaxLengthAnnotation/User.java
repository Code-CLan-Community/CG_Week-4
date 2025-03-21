package intermediatelevel.UseMaxLengthAnnotation;

import javax.management.ConstructorParameters;

// Creating class User to use custom @MaxLength annotation
public class User
{
    @MaxLength(8)
    private String username;

    // Parameterized constructor of the class
    public User(String username) throws NoSuchFieldException {
        if (username.length() > this.getClass().getDeclaredField("username").getAnnotation(MaxLength.class).value())
        {
            throw new IllegalArgumentException("Username exceeds maximum length");
        }
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    // Main method
    public static void main(String[] args) throws NoSuchFieldException
    {
        // Handling IllegalArgumentException
        try
        {
            User user = new User("RajanChauhan");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}