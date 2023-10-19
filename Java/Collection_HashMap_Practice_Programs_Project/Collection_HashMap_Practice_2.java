package collection_hashmap_practice_program;

import java.util.*;
public class Collection_HashMap_Practice_2 {
    public static void main(String args[]) {

        // create two hash maps
        HashMap <Integer,String> hash_map_first = new HashMap <Integer,String> ();
        HashMap <Integer,String> hash_map_second = new HashMap <Integer,String> ();
        // populate hash maps

        hash_map_first.put(1, "Prajacta Mohod");
        hash_map_first.put(2, "Shalini  Shah");
        hash_map_first.put(3, "Shweta Rai");
        System.out.println("\nValues in first map: " + hash_map_first);
        hash_map_second.put(4, "Kiya Arora");
        hash_map_second.put(5, "Keshav Rathore");
        hash_map_second.put(6, "Kriya Kapoor");
        System.out.println("\nValues in second map: " + hash_map_second);

        // put all values in second map
        hash_map_second.putAll(hash_map_first);
        System.out.println("\nNow values in second map: " + hash_map_second);
    }
}

// code of copy all mappings from the specified map to another map