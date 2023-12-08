package collection_treemap_practice_program;



import java.util.*;
public class Collection_TreeMap_Practice_1 {
    public static void main(String args[]){
        // Create a tree map
        TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();
        // Put elements to the map
        tree_map.put(1, "Prajacta Mohod");
        tree_map.put(2, "Grishma kamble");
        tree_map.put(3, "Shalini Roy");
        tree_map.put(4, "Tanvi kumar");
        tree_map.put(5, "Shweta Kapoor");

        for (Map.Entry<Integer,String> entry : tree_map.entrySet())
        {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}

// code of the specified value with the specified key in a Tree Map
