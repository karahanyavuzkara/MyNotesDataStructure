import java.util.*;
import java.util.Queue;
public class QueueTest {
    public static void main(String [] args){
        Queue <Integer> queue = new LinkedList<Integer>();

        queue.add(61);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Elements in Queue :" + queue);

        System.out.println("Head of the queue : " + queue.element());

        System.out.println("Element removed from the queue :" + queue.remove());

        System.out.println(" New Head of the queue : " + queue.element());

        System.out.println("Final Queue: " + queue);
    }
}
