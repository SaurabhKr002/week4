package reflection.intermediatelevel.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Custom annotation to store author information
@Target(ElementType.TYPE) // Applied to classes
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
public @interface Author {
    String name(); // Element to store the author's name
}
