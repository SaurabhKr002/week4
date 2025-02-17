package annotations.practiceproblems.beginnerlevel.todoannotation;

import java.lang.reflect.Method;

public class TodoProcessor {
    public static void main(String[] args) {
        Class<TaskManager> clazz = TaskManager.class;

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Pending Task:");
                System.out.println("  Task: " + todo.task());
                System.out.println("  Assigned To: " + todo.assignedTo());
                System.out.println("  Priority: " + todo.priority());
                System.out.println("------------------------------");
            }
        }
    }
}
