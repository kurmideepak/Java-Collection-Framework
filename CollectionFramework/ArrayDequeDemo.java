package CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(22);
        adq.offer(23);
        adq.offer(24);
        adq.offer(25);
        adq.offer(26);
        adq.offer(27);
        adq.offer(28);
        System.out.println(adq);

        adq.offerFirst(20); // Add element at the first positon
        adq.offerLast(40); // Add element at the last position
        System.out.println(adq);

        System.out.println(adq.peek()); //Show the next element to be remove
        System.out.println(adq.peekFirst()); //Show the next element to be remove first
        System.out.println(adq.peekLast());  //Show the next element to be remove last


        System.out.println(adq.poll()); // Remove first element
        System.out.println("poll() "+ adq);

        System.out.println(adq.pollFirst());  // Remove first element
        System.out.println("pollFirst() "+ adq);

        System.out.println(adq.pollLast());  // Remove Last element
        System.out.println("pollLast() "+ adq);
    }
}
