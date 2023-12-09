package collection_treemap_practice_program;
import java.util.*;
import java.util.Map.Entry;
public class Collection_TreeMap_Practice_12 {
    public static void main(String args[]) {

        // Create a tree map
        TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();

        // Put elements to the map
        tree_map1.put(10, "Reena_Dara");
        tree_map1.put(20, "Garima_Roy");
        tree_map1.put(40, "Anuki_Kapoor");
        tree_map1.put(50, "Anita_Shahi");
        tree_map1.put(60, "Shalini_Shaho");

        System.out.println("Orginal TreeMap content: " + tree_map1);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + tree_map1.lowerKey(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + tree_map1.lowerKey(20));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + tree_map1.lowerKey(70));
    }
}

// code to get the greatest key strictly less than the given key Return null if there is no such key.
