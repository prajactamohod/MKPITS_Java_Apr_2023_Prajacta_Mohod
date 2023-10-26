package collection_treemap_practice_program;

import java.util.*;
import java.util.Map.Entry;
public class Collection_TreeMap_Practice_14 {
    public static void main(String args[]) {

        // Create a tree map
        TreeMap < Integer, String > tree_map_first = new TreeMap < Integer, String > ();

        // Put elements to the map
        tree_map_first.put(10, "Riya_kapoor");
        tree_map_first.put(20, "Garima_Shani");
        tree_map_first.put(40, "Shalini_Roy");
        tree_map_first.put(50, "Varsha_Adau");
        tree_map_first.put(60, "Prajacta_Mohod");

        System.out.println("Orginal TreeMap content: " + tree_map_first);
        System.out.println("Orginal TreeMap content: " + tree_map_first.navigableKeySet());

    }
}

// code  to get a NavigableSet view of keys in a map