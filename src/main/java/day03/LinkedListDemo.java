package day03;

import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main (String[]args){
        LinkedList <String> queue =  new LinkedList<>();
        queue.add("TX001");
        queue.add("TX002");
        queue.add("TX003");
        System.out.println(queue);

        queue.addFirst("TX000");
        System.out.println(queue);

        queue.addLast("TX004");
        System.out.println(queue);

        queue.removeFirst();
        System.out.println(queue);

        queue.removeLast();
        System.out.println(queue);

    }
}
