package annotations.practiceproblems.beginnerlevel.todoannotation;

public class TaskManager {

    @Todo(task = "Implement user authentication", assignedTo = "Saurabh", priority = "HIGH")
    public void userAuth() {
        // Authentication logic (not implemented yet)
    }

    @Todo(task = "Optimize database queries", assignedTo = "Anand")
    public void optimizeQueries() {
        // Query optimization logic (not implemented yet)
    }

    @Todo(task = "Add payment gateway", assignedTo = "Kuldeep", priority = "CRITICAL")
    public void addPaymentGateway() {
        // Payment gateway logic (not implemented yet)
    }
}
