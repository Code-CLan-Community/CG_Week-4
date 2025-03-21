package commonproblem.UseOverrideAnnotation;

// Creating class Dog that extends Animal class
public class Dog extends Animal
{
    @Override
    public String makeSound()
    {
        return ("Barking");
    }

    // Main Method
    public static void main(String[] args)
    {
        // Creating object of Dog class
        Dog dog = new Dog();
        // Calling method makeSound
        System.out.println(dog.makeSound());
    }
}
