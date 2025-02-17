package annotations.exercises.useoverride;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class DogTest {

    @Test
    void testMakeSound() {
        Dog dog = new Dog();

        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dog.makeSound();

        // Normalize newlines for cross-platform compatibility
        String expectedOutput = "Dog barks" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
