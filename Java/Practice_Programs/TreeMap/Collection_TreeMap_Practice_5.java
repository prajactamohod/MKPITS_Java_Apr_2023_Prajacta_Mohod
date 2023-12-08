package collection_treemap_practice_program;

import java.util.*;
public class Collection_TreeMap_Practice_5 {
    public static void main(String args[]){
        // Create a tree map
        TreeMap<String,String> tree_map1=new TreeMap<String,String>();
        // Put elements to the map
        tree_map1.put("element_1", "Prajacta Mohod");
        tree_map1.put("element_2", "Grishma kamble");
        tree_map1.put("element_3", "Aadtiya Kapadiya");
        tree_map1.put("element_4", "Roy");

        Set<String> keys = tree_map1.keySet();
        for(String key: keys){
            System.out.println(key);
        }
    }
}

// code of  get all keys from a Tree Map