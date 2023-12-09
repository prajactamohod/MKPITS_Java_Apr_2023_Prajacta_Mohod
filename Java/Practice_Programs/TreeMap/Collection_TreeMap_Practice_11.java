import java.util.*;
import java.util.Map.Entry;
public class Collection_TreeMap_Practice_11 {
    public static void main(String args[]){

        // Create a tree map
        TreeMap< Integer, String > tree_map_first = new TreeMap< Integer, String >();

        // Put elements to the map
        tree_map_first.put(10, "Reena");
        tree_map_first.put(20, "Garima");
        tree_map_first.put(40, "Prajacta");
        tree_map_first.put(50, "Anuki");
        tree_map_first.put(60, "Priya");

        System.out.println("Orginal TreeMap content: "+tree_map_first);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): "+tree_map_first.lowerEntry(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): "+tree_map_first.lowerEntry(20));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): "+tree_map_first.lowerEntry(70));
    }
}

// code of  to get a key-value mapping associated with the greatest key strictly less than the given key, Return null if there is no such key