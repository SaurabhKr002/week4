package filehandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking file paths from the user
        System.out.print("Enter source file path: ");
        String sourceFile = scanner.nextLine();

        System.out.print("Enter destination file path: ");
        String destinationFile = scanner.nextLine();

        FileHandler.copyFile(sourceFile, destinationFile);
        scanner.close();
    }
}
