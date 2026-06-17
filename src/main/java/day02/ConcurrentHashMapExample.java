package day02;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main (String [] args) {
        ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();
        scores.put("Alice", 90);
        scores.put("reva", 80);
        scores.put("chakitan", 70);

        System.out.println(scores.get("reva"));
        System.out.println(scores.containsKey("chakitan"));
        try{
        scores.put(null,80);}
        catch (NullPointerException e){
        System.out.println("No null keys!!");}

        scores.putIfAbsent("reva", 22);
        scores.putIfAbsent("neha",70);
        System.out.println(scores.get("reva"));
        System.out.println(scores.get("neha"));
    }
}
