package annotations.practiceproblems.beginnerlevel.annotationtomarkimportantmethods;

class TaskHandler {

    @ImportantMethod(level = "CRITICAL")
    public void processCriticalTask() {
        System.out.println("Processing critical task...");
    }

    @ImportantMethod
    public void processGeneralTask() {
        System.out.println("Processing general task...");
    }

    public void regularTask() {
        System.out.println("Processing regular task...");
    }
}
