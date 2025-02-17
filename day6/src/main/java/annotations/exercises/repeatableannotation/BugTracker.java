package annotations.exercises.repeatableannotation;

class BugTracker {

    @BugReport(description = "Null pointer exception occurs when input is null")
    @BugReport(description = "IndexOutOfBoundsException when accessing list")
    public void processBugs() {
        System.out.println("Processing bugs...");
    }
}
