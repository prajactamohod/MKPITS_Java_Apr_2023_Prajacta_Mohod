package collection_treemap_practice_program;

import java.util.*;
import java.util.Map.Entry;
public class Collection_TreeMap_Practice_8 {
    public static void main(String args[]) {

        // Create a tree map
        TreeMap <String,String> tree_map_first = new TreeMap <String,String> ();

        // Put elements to the map
        tree_map_first.put("element_first", "Prajacta Mohod");
        tree_map_first.put("element_second", "Shalini roy");
        tree_map_first.put("element_Third", "kiya Desai");
        tree_map_first.put("eleemnt_four", "Pooja Bansod");

        System.out.println("Orginal TreeMap content: " + tree_map_first);
        System.out.println("Greatest key: " + tree_map_first.firstEntry());
        System.out.println("Least key: " + tree_map_first.lastEntry());
    }
}

// code of   to get a key-value mapping associated with the greatest key and the least key in a map
