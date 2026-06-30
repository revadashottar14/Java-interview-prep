package day08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SimpleCallableDemo {
    public static void main(String[]args){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> result1 = executor.submit(()->{
            System.out.println("Task 1");
            Thread.sleep(1000);
            return 5*10;
        });
        Future<Integer> result2 = executor.submit(()-> {
            System.out.println("Task 2");
            Thread.sleep(1000);
            return 3*20 ;
        });

        System.out.println("Getting results back");
        try{
            int res1 = result1.get();
            System.out.println("Result 1 "+res1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            int res2 = result2.get();
            System.out.println("Result2 "+res2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
        System.out.println("\n=== Done ===");
    }
}
