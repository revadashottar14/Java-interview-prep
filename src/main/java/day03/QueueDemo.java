package day03;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDemo {
    public static void main (String[]args){
        Deque<String> queue = new ArrayDeque<>();

        queue.offer("TX001");
        queue.offer("TX002");
        queue.offer("TX003");

        System.out.println(queue);
        System.out.println("First"+queue.peek());
        System.out.println("Processing"+queue.poll());
        System.out.println("Processing"+queue.poll());
        System.out.println("Remaining"+queue);

    }
}
