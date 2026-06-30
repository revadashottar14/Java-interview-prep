package day08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {

        // Create a pool of 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        System.out.println("Submitting 10 tasks to a pool of 5 threads...\n");

        // Submit 10 tasks
        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " executed by " +
                        Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);  // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Shutdown (wait for all tasks to complete)
        executor.shutdown();

        System.out.println("\nAll tasks submitted. Waiting for completion...");

        // Wait for executor to finish
        try {
            if (executor.awaitTermination(30, java.util.concurrent.TimeUnit.SECONDS)) {
                System.out.println("All tasks completed!");
            } else {
                System.out.println("Timeout! Some tasks didn't complete.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}