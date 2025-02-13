package queueinterface.stackusingqueues;

// Main class to test stack operations
public class Main {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element: " + stack.top()); // Output: 3
        System.out.println("Popped: " + stack.pop()); // Output: 3
        System.out.println("Top element: " + stack.top()); // Output: 2
    }
}
