package annotations.practiceproblems.intermediatelevel.annotationforloggingmethodexecutiontime;

import java.lang.reflect.Method;

public class LogExecutionTimeProcessor {

    public static void processAnnotations(Object obj) throws Exception {
        Class<?> clazz = obj.getClass(); // Get the class of the provided object

        for (Method method : clazz.getDeclaredMethods()) { // Iterate through all methods
            if (method.isAnnotationPresent(LogExecutionTime.class)) { // Check if method has @LogExecutionTime
                long startTime = System.nanoTime(); // Capture start time

                method.setAccessible(true); // Ensure method is accessible
                method.invoke(obj); // Invoke the method

                long endTime = System.nanoTime(); // Capture end time
                long executionTime = endTime - startTime; // Calculate execution time

                System.out.println("Execution time of " + method.getName() + " : " + executionTime + " nanoseconds"); // Print execution time
            }
        }
    }
}
