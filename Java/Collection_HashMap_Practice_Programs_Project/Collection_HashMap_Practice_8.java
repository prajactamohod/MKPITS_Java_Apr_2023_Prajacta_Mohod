package collection_hashmap_practice_program;




import java.util.*;
public class  Collection_HashMap_Practice_8  {
    public static void main(String args[]) {

        HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
        hash_map.put(1, "Prajacta");
        hash_map.put(2, "Shalini");
        hash_map.put(3, "Shweta");
        hash_map.put(4, "Amrita");
        hash_map.put(5, "Sakshi");
        // create set view for the map
        Set set = hash_map.entrySet();
        // check set values
        System.out.println("Set values: " + set);
    }
}

// code of create a set view of the mappings contained in a map