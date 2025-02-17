package annotations.exercises.repeatableannotation;

import java.lang.reflect.Method;

class BugReportProcessor {

    public static void processBugReports(Class<?> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(BugReports.class)) {
                BugReports bugReports = method.getAnnotation(BugReports.class);
                System.out.println("Method: " + method.getName());
                for (BugReport bug : bugReports.value()) {
                    System.out.println("Bug Report: " + bug.description());
                }
            }
        }
    }
}
