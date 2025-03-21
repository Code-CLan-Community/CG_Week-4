package advancelevel.TestCustomLoggingProxyUsingReflection;
import advancedlevel.CustomLoggingProxyUsingReflection.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Proxy;
import static org.junit.jupiter.api.Assertions.*;
// Creating class CustomLoggingProxyUsingReflectionTest to test our CustomLoggingProxyUsingReflection program
public class CustomLoggingProxyUsingReflectionTest
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Greeting proxy;

    @BeforeEach
    void setUpStreams()
    {
        System.setOut(new PrintStream(outContent));
    }

    @BeforeEach
    void setUpProxy() {
        Greeting greeting = new GreetingImpl();
        proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new LoggingProxyHandler(greeting)
        );
    }

    @Test
    void testLoggingProxy()
    {
        proxy.sayHello();
        String output = outContent.toString();
        assertTrue(output.contains("Invoking method: sayHello"));
        assertTrue(output.contains("Hello, world!"));
    }
}
