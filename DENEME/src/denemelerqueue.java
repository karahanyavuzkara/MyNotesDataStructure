
import java.util.*;
public class denemelerqueue {
    public static void main(String[]args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(15);
        queue.add(23);
        queue.add(61);
        queue.add(17);
        queue.add(4);

        System.out.println("Elements of queue :" + queue);
        System.out.println("Head element of the queue : " + queue.element());
        Integer popped = queue.remove();
        System.out.println("Removed element : " + popped);
        System.out.println("New queue :" + queue);
    }
}
