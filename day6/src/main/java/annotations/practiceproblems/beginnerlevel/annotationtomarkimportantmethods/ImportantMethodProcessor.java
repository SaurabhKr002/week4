package annotations.practiceproblems.beginnerlevel.annotationtomarkimportantmethods;

import java.lang.reflect.Method;

class ImportantMethodProcessor {

    public static void processImportantMethods(Class<?> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Important Method: " + method.getName() + " | Level: " + annotation.level());
            }
        }
    }
}
