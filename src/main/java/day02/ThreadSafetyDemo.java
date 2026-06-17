package day02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafetyDemo {
    public static void main(String[] args) throws InterruptedException {

        // Test each map with 1000 threads all writing at the same time
        testMap("HashMap",            new HashMap<>());
        testMap("Hashtable",          new Hashtable<>());
        testMap("ConcurrentHashMap",  new ConcurrentHashMap<>());
    }

    static void testMap(String name, Map<String, Integer> map) throws InterruptedException {

        map.put("count", 0);

        // Create 1000 threads — each adds 1 to "count"
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(() -> {
                map.compute("count", (key, value) -> value + 1);// write current + 1
            });
        }

        // Start all 1000 threads
        for (Thread t : threads) t.start();

        // Wait for all threads to finish
        for (Thread t : threads) t.join();

        System.out.println(name + " final count: " + map.get("count"));
        // Expected: 1000
    }
}