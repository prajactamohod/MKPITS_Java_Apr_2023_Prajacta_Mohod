package collection_treemap_practice_program;

import java.util.*;
public class Collection_TreeMap_Practice_4 {
    public static void main(String args[]){

        // Create a tree map
        TreeMap<String,String> tree_map_first=new TreeMap<String,String>();

        // Put elements to the map
        tree_map_first.put("element_first", "Prajacta Mohod");
        tree_map_first.put("element_second", "Prajwal Roy");
        tree_map_first.put("element_third", "Prince Mohod");
        tree_map_first.put("element_four", "Ashwariya kapadiya");

        if(tree_map_first.containsValue("Prajacta Mohod")){
            System.out.println("The TreeMap contains word  Prajacta Mohod");
        } else {
            System.out.println("The TreeMap does not contain word Prajacta Mohod");
        }
        if(tree_map_first.containsValue("Parchi Adau")){
            System.out.println("The TreeMap contains word Prachi Adau");
        } else {
            System.out.println("The TreeMap does not contain word Prachi Adau");
        }
    }
}