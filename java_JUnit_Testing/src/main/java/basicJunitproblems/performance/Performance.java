package basicJunitproblems.calculator.performance;

public class Performance {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(1500); //(3 seconds)
        return "Task Completed";
    }
}
