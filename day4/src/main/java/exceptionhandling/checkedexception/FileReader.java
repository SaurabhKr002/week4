package exceptionhandling.checkedexception;

import java.io.*;

public class FileReader {
    public static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            return "File not found"; // Return message instead of printing
        } catch (IOException e) {
            return "Error reading the file: " + e.getMessage();
        }
        return content.toString().trim(); // Return file content
    }

    public static void main(String[] args) {
        System.out.println(readFile("D:\\Capg\\week4\\day4\\src\\main\\java\\exceptionhandling\\checkedexception\\hello.txt"));
        System.out.println(readFile("data.txt"));
    }
}
