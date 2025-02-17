package annotations.exercises.customannotation;

import java.lang.reflect.Method;

class AnnotationProcessor {

    public static void processAnnotations(Class<?> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }
        }
    }
}
