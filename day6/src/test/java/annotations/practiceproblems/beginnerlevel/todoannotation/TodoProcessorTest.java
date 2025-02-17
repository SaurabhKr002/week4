package annotations.practiceproblems.beginnerlevel.todoannotation;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TodoProcessorTest {

    @Test
    void testTodoAnnotationProcessing() {
        Class<TaskManager> clazz = TaskManager.class;
        List<String> tasks = new ArrayList<>();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                tasks.add(todo.task() + " (Assigned To: " + todo.assignedTo() + ", Priority: " + todo.priority() + ")");
            }
        }

        // Convert immutable list to mutable list before sorting
        List<String> expectedTasks = new ArrayList<>(List.of(
                "Implement user authentication (Assigned To: Saurabh, Priority: HIGH)",
                "Optimize database queries (Assigned To: Anand, Priority: MEDIUM)",
                "Add payment gateway (Assigned To: Kuldeep, Priority: CRITICAL)"
        ));

        // Sort both lists before assertion
        Collections.sort(tasks);
        Collections.sort(expectedTasks);

        assertEquals(expectedTasks, tasks, "Mismatch in retrieved tasks.");
    }
}
