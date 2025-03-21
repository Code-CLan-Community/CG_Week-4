package advancedlevel.GenerateJSONRepresentation;

// Creating class Person
public class Person
{
    private String name;
    private int age;

    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString()
    {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
