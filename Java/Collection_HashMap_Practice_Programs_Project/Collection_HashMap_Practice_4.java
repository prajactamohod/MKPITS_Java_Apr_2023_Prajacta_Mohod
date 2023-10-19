package collection_hashmap_practice_program;


import java.util.*;
public class Collection_HashMap_Practice_4 {
    public static void main(String args[]) {
        HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
        hash_map.put(1, "Anita kapoor");
        hash_map.put(2, "Gurkirat Obreio");
        hash_map.put(3, "Ashu Warkari");
        hash_map.put(4, "Aniket Wankahde");
        hash_map.put(5, "Prajacta Mohod");
        // print the map
        System.out.println("The Original linked map: " + hash_map);
        // Removing all the elements from the linked map
        hash_map.clear();
        System.out.println("The New map: " + hash_map);
    }
}

// code of  check whether a map contains key-value mappings (empty) or not