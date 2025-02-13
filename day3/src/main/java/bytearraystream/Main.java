package bytearraystream;

public class Main {
    public static void main(String[] args) {
        String inputImagePath = "C:\\Users\\82484\\OneDrive\\Pictures\\Camera Roll\\WIN_20240921_10_16_15_Pro.jpg";
        String outputImagePath = "C:\\Users\\82484\\OneDrive\\Pictures\\Camera Roll\\WIN_20220904_23_14_47_Pro.jpg"; // Image will be written here

        // Convert image to byte array
        byte[] imageBytes = ImageConverter.imageToByteArray(inputImagePath);
        if (imageBytes.length == 0) {
            System.out.println("Failed to convert image to byte array.");
            return;
        }

        // Convert byte array back to image
        ImageConverter.byteArrayToImage(imageBytes, outputImagePath);
        System.out.println("Image conversion completed successfully.");
    }
}
