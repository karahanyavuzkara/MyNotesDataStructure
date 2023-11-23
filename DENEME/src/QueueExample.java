import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String [] args) {

        Queue <String> waitingQueue = new LinkedList<>();

        waitingQueue.add("Rajeev");
        waitingQueue.add("Chris");
        waitingQueue.add("John");
        waitingQueue.add("Mark");
        waitingQueue.add("Steven");

        System.out.println("WaitingQueue : " + waitingQueue);

        String name = waitingQueue.remove();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitinqQueue : " + waitingQueue );

        name = waitingQueue.poll();
        System.out.println("Removed from WaitingQueue: "+ name + " | New Waiting Queue : " + waitingQueue);


    }
}
