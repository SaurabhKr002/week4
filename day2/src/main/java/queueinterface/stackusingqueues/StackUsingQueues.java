package queueinterface.stackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

// Stack implementation using two queues
public class StackUsingQueues {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {
        queue2.add(x);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Remove and return the top element
    public int pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue1.poll();
    }

    // Get the top element
    public int top() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue1.peek();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}
