package advancedlevel.DependencyInjectionUsingReflection;

public class Client {
    @Inject
    private Dependency dependency;

    public void performAction() {
        dependency.doSomething();
    }
}
