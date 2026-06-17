package day03;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDemo {
    public static void main(String[]args){
        Deque<String> stack = new ArrayDeque<>();
        stack.push("reva");
        stack.push("chakitan");
        stack.push("krishna");

        System.out.println(stack);

        System.out.println("undo"+stack.pop());
        System.out.println("undo"+stack.pop());
        System.out.println("undo"+stack.pop());
        System.out.println("undo"+stack.pop());
        System.out.println("remaining"+stack);
    }
}
