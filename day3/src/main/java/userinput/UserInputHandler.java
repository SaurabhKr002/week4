package userinput;

import java.io.*;

class UserInputHandler {
    private static final String FILE_PATH = "D:\\Txt_Files_II\\Store_info.txt";

    // Reads user input using BufferedReader
    public static String[] getUserInput() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            return new String[]{name, String.valueOf(age), language};
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading input: " + e.getMessage());
            return null;
        }
    }

    // Writes user data to a file using FileWriter
    public static void saveToFile(String[] userData) {
        if (userData == null) {
            System.out.println("No data to write.");
            return;
        }
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write("Name: " + userData[0] + "\n");
            writer.write("Age: " + userData[1] + "\n");
            writer.write("Favorite Language: " + userData[2] + "\n");
            writer.write("---------------------------\n");
            System.out.println("Data saved successfully in " + FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
