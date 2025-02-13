// Main class for Circular Buffer Simulation
package queueinterface.circularbuffer;

public class CircularBuffer {
    private int[] buffer;
    private int head, tail, size, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    // Inserts an element into the circular buffer
    public void insert(int value) {
        if (size == capacity) {
            head = (head + 1) % capacity; // Overwrite oldest element
        } else {
            size++;
        }
        buffer[tail] = value;
        tail = (tail + 1) % capacity;
    }

    // Returns the current buffer contents
    public int[] getBufferContents() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = buffer[(head + i) % capacity];
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4); // Overwrites oldest element (1)

        int[] contents = buffer.getBufferContents();
        for (int num : contents) {
            System.out.print(num + " ");
        }
        // Expected Output: 2 3 4
    }
}
