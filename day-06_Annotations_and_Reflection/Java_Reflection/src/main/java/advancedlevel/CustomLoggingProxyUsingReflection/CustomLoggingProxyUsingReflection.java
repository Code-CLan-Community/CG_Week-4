package advancedlevel.CustomLoggingProxyUsingReflection;
import java.lang.reflect.Proxy;
// Creating class CustomLoggingProxyUsingReflection
public class CustomLoggingProxyUsingReflection
{
    // Main method
    public static void main(String[] args)
    {
        Greeting greeting = new GreetingImpl();
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new LoggingProxyHandler(greeting)
        );
        proxy.sayHello();
    }
}
