package CollectionFramework;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
       pq.offer(9);
        pq.offer(10);
        pq.offer(11);
        pq.offer(122);
        pq.offer(13);
        pq.offer(14);
        pq.offer(15);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());



    }
}
