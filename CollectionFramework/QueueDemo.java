package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // First In First Out
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);
        queue.offer(16);
        queue.add(17); // Add element, if not it throws an exception

        System.out.println(queue);

        queue.poll(); // Remove the first element
        System.out.println(queue);


        System.out.println(queue.peek()); //Which element is next to pop
        System.out.println(queue.element()); // same work as peek() function but if we have empty list then it return exception


    }
}
