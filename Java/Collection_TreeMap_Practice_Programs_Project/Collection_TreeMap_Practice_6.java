package collection_treemap_practice_program;



import java.util.*;
        import java.util.Map.Entry;
public class Collection_TreeMap_Practice_6 {
    public static void main(String args[]){
        // Create a tree map
        TreeMap<String,String> tree_map_first = new TreeMap<String,String>();
        // Put elements to the map
        tree_map_first.put("element_first", "Prajacta Mohod");
        tree_map_first.put("element_second", "Grishma Kamble");
        tree_map_first.put("element_third", "Sana Khan");
        tree_map_first.put("element_four", "Ada roy");

        System.out.println("Orginal TreeMap content: "+tree_map_first);
        tree_map_first.clear();  // clear
        System.out.println("The New map: "+tree_map_first);
    }
}

// code of delete all elements from a Tree Map