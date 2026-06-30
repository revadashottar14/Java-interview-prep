package day08;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        System.out.println("Submitting 5 tasks that return values...\n");

        // Submit Callable tasks (have return value)
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;

            Future<Integer> future = executor.submit(() -> {
                System.out.println("Task " + taskId + " computing...");
                Thread.sleep(1000);
                return taskId * 100;  // Return result
            });

            // Get the result (blocks until task completes)
            try {
                Integer result = future.get();
                System.out.println("Task " + taskId + " result: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        System.out.println("Done!");
    }
}