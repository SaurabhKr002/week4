package queueinterface.generatebinarynumbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 5; // Number of binary numbers to generate
        String[] binaryNumbers = BinaryNumberGenerator.generateBinaryNumbers(n);
        System.out.println("Binary Numbers: " + Arrays.toString(binaryNumbers)); // Print output
    }
}
