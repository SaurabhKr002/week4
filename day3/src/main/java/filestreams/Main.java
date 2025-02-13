package filestreams;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source file path: ");
        String sourceFile = scanner.nextLine();

        System.out.print("Enter destination file path for unbuffered copy: ");
        String unbufferedFile = scanner.nextLine();

        System.out.print("Enter destination file path for buffered copy: ");
        String bufferedFile = scanner.nextLine();

        System.out.println("Copying using unbuffered streams...");
        FileCopier.copyFileUnbuffered(sourceFile, unbufferedFile);

        System.out.println("Copying using buffered streams...");
        FileCopier.copyFileBuffered(sourceFile, bufferedFile);

        scanner.close();
    }
}
