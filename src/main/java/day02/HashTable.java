package day02;
import java.util.Hashtable;



public class HashTable {
    public static void main (String []args) {
        Hashtable<String, Integer> scores = new Hashtable<>();

        scores.put("Alice", 90);
        scores.put("Bob", 89);
        scores.put("reva", 67);

        System.out.println(scores.get("reva"));
        System.out.println(scores.get("Heera"));
        System.out.println(scores.get("Alice"));

        System.out.println(scores.containsKey("Bob"));
        try {
            scores.put(null, 60);
        } catch (NullPointerException e) {
            System.out.println("Hashtable does not allow null keys!");
        }
        try{
            scores.put("chakitan", null);
        } catch (NullPointerException e){
            System.out.println("Hashtable does not allow null values!");
        }
    }

}
