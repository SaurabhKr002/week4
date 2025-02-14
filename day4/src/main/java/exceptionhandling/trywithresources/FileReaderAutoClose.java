package exceptionhandling.trywithresources;

import java.io.*;

public class FileReaderAutoClose {
    public static String readFirstLine(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.readLine(); // Read the first line
        } catch (IOException e) {
            return "Error reading file"; // Handle file not found or other IO errors
        }
    }

    public static void main(String[] args) {
        System.out.println(readFirstLine("D:\\Capg\\week4\\day4\\src\\main\\java\\exceptionhandling\\trywithresources\\hello.txt")); // Test case
        System.out.println(readFirstLine("nonexistent.txt")); // Non-existing file
    }
}
