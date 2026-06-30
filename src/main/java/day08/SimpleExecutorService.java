package day08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecutorService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 5; i++) {
            final int TaskId = i;

            executor.submit(() -> {
                System.out.println("TaskId " + TaskId + " Thread" + Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + TaskId + " finished");
            });
        }
        System.out.println("\nAll tasks submitted. Waiting for completion...\n");

        executor.shutdown();
        System.out.println("=== Done ===");
    }
}