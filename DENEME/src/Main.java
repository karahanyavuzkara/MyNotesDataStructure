import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int a = 1, b = 5, c = 0, d = 0, e = 1;

        // Creating a Queue
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue as per the given instructions
        queue.add("" + a + e + b);
        queue.add("" + (-b) + c + a);
        queue.add("" + b + e);
        queue.add("" + e + a + c);
        queue.add("" + (-a) + 2 + b);
        queue.add("" + (-a) + 1 + c);
        queue.add("" + c + a);
        queue.add("" + 2 + a + b);
        queue.add("" + a + c + d);
        queue.add("" + (-3) + d + e);

        // Printing the elements added to the queue
        System.out.println("Elements in the Queue: " + queue);

        // Applying commands to the Queue
        System.out.println("Remove first element: " + queue.remove());
        System.out.println("Head of the queue: " + queue.peek());
        System.out.println("Remove and return the head: " + queue.poll());
        System.out.println("Head of the queue: " + queue.peek());
        System.out.println("Contents of the Queue: " + queue);
    }
}
