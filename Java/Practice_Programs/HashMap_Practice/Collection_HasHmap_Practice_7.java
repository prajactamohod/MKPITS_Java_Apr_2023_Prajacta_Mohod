package collection_hashmap_practice_program;




import java.util.*;
public class Collection_HasHmap_Practice_7 {
    public static void main(String args[]) {
        HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
        hash_map.put(1, "Shalini");
        hash_map.put(2, "Mayuri");
        hash_map.put(3, "Kriya");
        hash_map.put(4, "Anita");
        hash_map.put(5, "Zaara");

        // create set view for the map
        Set set = hash_map.entrySet();
        // check set values
        System.out.println("Set values: " + set);
    }
}

// code to create a set view of the mappings contained in a map