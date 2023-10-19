package collection_hashmap_practice_program;

import java.util.*;
public class Collection_HashMap_Practice_5 {
    public static void main(String args[]) {

        HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
        hash_map.put(1, "Kriya Khan");
        hash_map.put(2, "Ada Arora");
        hash_map.put(3, "Shalini Iyer");
        hash_map.put(4, "Prajacta Mohod");
        hash_map.put(5, "Rutuja Sonone");

        // check if map is empty
        boolean result = hash_map.isEmpty();

        // check the result
        System.out.println("Is hash map empty: " + result);

        // Removing all the elements from the linked map
        hash_map.clear();

        // check if map is empty
        result = hash_map.isEmpty();

        // check the result
        System.out.println("Is hash map empty: " + result);
    }
}

// code of check whether a map contains key-value mappings (empty) or not