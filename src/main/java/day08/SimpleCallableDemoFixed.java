package day08;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SimpleCallableDemoFixed {
    public static void main(String[]args){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Future<Integer>> results = new ArrayList<>();
        for(int i=0; i<=4; i++){
            final int TaskId = i;
            Future<Integer> future = executor.submit(()->{
                System.out.println("Computing..... "+TaskId);
                Thread.sleep(1000);
                return TaskId*10;
            });
            results.add(future);
        }
        System.out.println("\n==All Tasks Submitted");
        try{
            for(int i=0; i< results.size(); i++){
                int res = results.get(i).get();
                System.out.println("Task " + (i+1) + " result: " + res);
            }
            } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
        System.out.println("DONE");
        }
    }
