package collection_treemap_practice_program;


import java.util.*;
public class Collection_TreeMap_Practice_3 {
    public static void main(String args[]){

        // Create a tree map
        TreeMap<String,String> tree_map_first=new TreeMap<String,String>();

        // Put elements to the map
        tree_map_first.put("element_First", "Prajacta Mohod");
        tree_map_first.put("element_second", "Mayuri kamble");
        tree_map_first.put("element_third", "Shalini Yawale");
        tree_map_first.put("element_fourth", "Diya Desai");

        System.out.println(tree_map_first);
        if(tree_map_first.containsKey("element_First")){
            System.out.println("The Tree Map contains key element_First");
        } else {
            System.out.println("The Tree Map does not contain key element_First");
        }
        if(tree_map_first.containsKey("element_Five")){
            System.out.println("The Tree Map contains key element_Five");
        } else {
            System.out.println("The TreeMap does not contain key element_Five");
        }
    }
}