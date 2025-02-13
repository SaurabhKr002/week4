package queueinterface.reverseaqueue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static Queue<Integer> reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>(); // Stack to store queue elements

        while (!queue.isEmpty()) {
            stack.push(queue.remove()); // Move queue elements to stack
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop()); // Move stack elements back to queue
        }

        return queue; // Return reversed queue
    }
}
