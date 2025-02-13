package bytearraystream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class ImageConverterTest {

    @Test
    void testImageConversion() {
        String testInput = "C:\\Users\\82484\\OneDrive\\Pictures\\Camera Roll\\WIN_20240921_10_16_15_Pro.jpg"; // Provide an existing test image
        String testOutput = "test_output.jpg";

        byte[] imageBytes = ImageConverter.imageToByteArray(testInput);
        assertNotNull(imageBytes, "Image byte array should not be null.");
        assertTrue(imageBytes.length > 0, "Image byte array should not be empty.");

        ImageConverter.byteArrayToImage(imageBytes, testOutput);
        File outputFile = new File(testOutput);
        assertTrue(outputFile.exists(), "Output image file should exist.");
    }
}
