package junit.basicjunittest.performance;

public class PerformanceTestDemo {

    // Method that takes 3 seconds to execute
    public String longRunningTask() {
        try {
            Thread.sleep(3000); // Simulating a long-running task
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}
