package filterstreams;

import java.io.*;

class TextConverter {
    // Converts uppercase letters to lowercase while reading and writing to a new file
    public static void convertUppercaseToLowercase(String inputFile, String outputFile) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
            System.out.println("Conversion completed successfully.");
        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
