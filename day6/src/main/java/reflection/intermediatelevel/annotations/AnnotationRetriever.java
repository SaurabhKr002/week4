package reflection.intermediatelevel.annotations;

import java.lang.annotation.Annotation;

public class AnnotationRetriever {
    public static String getAuthorName(Class<?> clazz) {
        // Check if the class is annotated with @Author
        if (clazz.isAnnotationPresent(Author.class)) {
            // Retrieve the @Author annotation
            Author author = clazz.getAnnotation(Author.class);
            return author.name(); // Return the name from the annotation
        }
        return "Author not found"; // Return default message if annotation is not present
    }
}
