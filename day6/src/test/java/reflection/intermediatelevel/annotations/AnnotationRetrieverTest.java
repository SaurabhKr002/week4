package reflection.intermediatelevel.annotations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnnotationRetrieverTest {

    @Test
    public void testGetAuthorName() {
        // Retrieve the author name for the Book class
        String authorName = AnnotationRetriever.getAuthorName(Book.class);

        // Verify that the retrieved name matches the expected value
        assertEquals("Saurabh Kumar", authorName, "Author name should be Saurabh Kumar");
    }
}
