package annotations.practiceproblems.intermediatelevel.annotationforloggingmethodexecutiontime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // Can be applied to methods only
@Retention(RetentionPolicy.RUNTIME) // Retained at runtime for reflection
public @interface LogExecutionTime {
}
