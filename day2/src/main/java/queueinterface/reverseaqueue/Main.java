package queueinterface.reverseaqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // Create a queue

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue); // Print original queue

        Queue<Integer> reversedQueue = ReverseQueue.reverse(queue); // Reverse the queue

        System.out.println("Reversed Queue: " + reversedQueue); // Print reversed queue
    }
}
