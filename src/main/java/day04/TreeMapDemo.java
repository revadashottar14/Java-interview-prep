package day04;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[]args) {
        Map<String,Integer> hasmap = new HashMap<>();
        hasmap.put("March", 3000);
        hasmap.put("January", 5000);
        hasmap.put("February", 4000);

        System.out.println(hasmap);

        Map<String, Integer> treemap = new TreeMap<>();

        treemap.put("March", 3000);
        treemap.put("January", 5000);
        treemap.put("February", 4000);

        System.out.println(treemap);
    }
}
