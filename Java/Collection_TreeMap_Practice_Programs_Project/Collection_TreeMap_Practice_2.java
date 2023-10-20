package collection_treemap_practice_program;

import java.util.*;
public class Collection_TreeMap_Practice_2 {
    public static void main(String args[]){

        // Create a tree map
        TreeMap<String,String> tree_map_first =new TreeMap<String,String>();

        // Put elements to the map
        tree_map_first.put("element", "Shalini Roy");
        tree_map_first.put("element", "Grishma Kamble");
        tree_map_first.put("element", "Mahira Khan");
        tree_map_first.put("element", "Samiksha Padole");
        tree_map_first.put("element", "Saloni Panchmiya");
        System.out.println("Tree Map 1: "+tree_map_first);
        TreeMap<String,String> tree_map_second = new TreeMap<String,String>();
        tree_map_second.put("2_element", "Orange");
        tree_map_second.put("2_element", "Pink");
        System.out.println("Tree Map 2: "+tree_map_second);
        tree_map_first.putAll(tree_map_second);
        System.out.println("Element copied map_second to map_first: "+tree_map_first);
    }
}

// code of