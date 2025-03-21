package advancedlevel.CustomLoggingProxyUsingReflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
// Creating class LoggingProxyHandler that implements InvocationHandler interface
public class LoggingProxyHandler implements InvocationHandler
{
    private final Object target;

    public LoggingProxyHandler(Object target)
    {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("Invoking method: " + method.getName());
        return method.invoke(target, args);
    }
}