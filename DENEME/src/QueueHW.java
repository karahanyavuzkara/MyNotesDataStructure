import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class QueueHW {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("ABC");
        queue.add("DEF");
        queue.add("GHI");
        queue.add("JKL");
        queue.add("MNO");

        System.out.println("Elements in queue : " + queue);

        System.out.println("Head element of queue : " + queue.element());

        queue.remove();

        System.out.println("Elements in queue after removed: " + queue);

        queue.add("PQR");
        boolean add = queue.add("PQR");
        System.out.println("Is now element added to queue : "+ add);

        System.out.println("Elements in queue after adding new element: " + queue);
    }
}
