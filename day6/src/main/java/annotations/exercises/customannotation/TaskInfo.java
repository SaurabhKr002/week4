package annotations.exercises.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define the annotation with priority and assignedTo fields
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TaskInfo {
    String priority();
    String assignedTo();
}
