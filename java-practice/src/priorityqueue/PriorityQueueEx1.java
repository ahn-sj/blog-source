package priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {

        Queue<Integer> priorityQueueLowest = new PriorityQueue<>();
        Queue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueueLowest.add(10);
        priorityQueueLowest.add(1);
        priorityQueueLowest.offer(100);

        priorityQueueHighest.add(10);
        priorityQueueHighest.add(1);
        priorityQueueHighest.offer(100);

        System.out.println(priorityQueueLowest.poll());  // 1
        System.out.println(priorityQueueHighest.poll()); // 100
    }
}
