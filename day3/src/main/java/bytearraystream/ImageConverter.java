package bytearraystream;

import java.io.*;
import java.nio.file.*;

class ImageConverter {
    // Reads an image file and converts it to a byte array
    public static byte[] imageToByteArray(String imagePath) {
        try {
            return Files.readAllBytes(Paths.get(imagePath));
        } catch (IOException e) {
            System.out.println("Error reading image: " + e.getMessage());
            return new byte[0];
        }
    }

    // Writes a byte array to a new image file
    public static void byteArrayToImage(byte[] imageBytes, String outputPath) {
        try (FileOutputStream fos = new FileOutputStream(outputPath)) {
            fos.write(imageBytes);
            System.out.println("Image successfully written to " + outputPath);
        } catch (IOException e) {
            System.out.println("Error writing image: " + e.getMessage());
        }
    }
}
