package queueinterface.generatebinarynumbers;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    public static String[] generateBinaryNumbers(int n) {
        String[] result = new String[n]; // Array to store binary numbers
        Queue<String> queue = new LinkedList<>(); // Queue for processing

        queue.add("1"); // Start with "1"

        for (int i = 0; i < n; i++) {
            String current = queue.poll(); // Get the front element
            result[i] = current; // Store in result array

            queue.add(current + "0"); // Append "0" and enqueue
            queue.add(current + "1"); // Append "1" and enqueue
        }
        return result;
    }
}
