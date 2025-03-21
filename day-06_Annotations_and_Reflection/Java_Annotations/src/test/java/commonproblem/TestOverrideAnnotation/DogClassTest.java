package commonproblem.TestOverrideAnnotation;
import commonproblem.UseOverrideAnnotation.Dog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating class DogClassTest to test our Dog class program
public class DogClassTest
{
    @Test
    public void testMakeSound()
    {
        Dog dog = new Dog();
        assertEquals("Barking", dog.makeSound());
    }
}