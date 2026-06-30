package day08;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableDemoFixed {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        System.out.println("Submitting 5 tasks...\n");

        List<Future<Integer>> futures = new ArrayList<>();

        // Step 1: Submit ALL tasks without waiting
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;

            Future<Integer> future = executor.submit(() -> {
                System.out.println("Task " + taskId + " computing on " +
                        Thread.currentThread().getName());
                Thread.sleep(2000);  // Simulate work
                return taskId * 100;
            });

            futures.add(future);  // Store for later
        }

        System.out.println("All tasks submitted. Now collecting results...\n");

        // Step 2: Collect results (NOW we wait)
        for (int i = 0; i < futures.size(); i++) {
            try {
                Integer result = futures.get(i).get();
                System.out.println("Task " + (i+1) + " result: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        System.out.println("Done!");
    }
}