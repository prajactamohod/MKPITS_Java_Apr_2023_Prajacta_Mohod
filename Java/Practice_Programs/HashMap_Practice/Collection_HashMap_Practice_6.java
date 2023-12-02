package collection_hashmap_practice_program;
import java.util.*;
public class Collection_HashMap_Practice_6 {
    public static void main(String args[]) {
        HashMap < String, Integer > hash_map = new HashMap < String, Integer > ();
        hash_map.put("Prajacta Mohod", 1);
        hash_map.put("Grishma kamble", 2);
        hash_map.put("Prajwal kapoor", 3);
        hash_map.put("Ekta kapoor", 4);
        hash_map.put("Monika Jaktap", 5);
        // print the map
        System.out.println("The Original map: " + hash_map);
        System.out.println("1. Is key 'Grishma kamble' exists?");
        if (hash_map.containsKey("Grishma kamble")) {
            //key exists
            System.out.println("yes! - " + hash_map.get("Grishma kamble"));
        } else {
            //key does not exists
            System.out.println("no!");
        }

        System.out.println("\n2. Is key 'Prince Mohod' exists?");
        if (hash_map.containsKey("prince Mohod")) {
            System.out.println("yes! - " + hash_map.get("Prince Mohod"));
        } else {
            System.out.println("no!");
        }
    }
}

// code  to test if a map contains a mapping for the specified key
