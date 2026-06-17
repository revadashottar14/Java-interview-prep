package day02;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main (String[]args){
        Map <String,Integer> scores = new HashMap<>();
        scores.put("Alice", 50);
        scores.put("Bob", 49);
        scores.put("Charlie", 90);

        System.out.println(scores.get("Alice"));
        //System.out.println(scores.get("Bob"));
        //System.out.println(scores.get("Charlie"));
        System.out.println(scores.get("reva"));

        System.out.println(scores.containsKey("Alice"));
        System.out.println(scores.containsKey("Bob"));
        System.out.println(scores.containsKey("reva"));
        System.out.println(scores.getOrDefault("reva",0));

        scores.put("Bob", 99);
        System.out.println(scores.get("Bob"));

        scores.remove("Charlie");
        System.out.println(scores.get("Charlie"));

        for(Map.Entry<String, Integer> entry : scores.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        scores.put(null, 50);
        System.out.println(scores.get("null"));

    }
}
