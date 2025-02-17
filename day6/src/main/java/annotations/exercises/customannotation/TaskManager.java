package annotations.exercises.customannotation;

class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Saurabh")
    public void completeTask() {
        System.out.println("Task completed.");
    }
}
