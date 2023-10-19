package collection_hashmap_practice_program;


import java.util.*;
public class Collection_HashMap_Practice_3 {
    public static void main(String args[]){

        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1, "Prajacta Mohod");
        hash_map.put(2, "Mahira Khan");
        hash_map.put(3, "Ada Khan");
        hash_map.put(4, "Reena Bajaj ");
        hash_map.put(5, "Pallivi Samjwar");
        System.out.println("Size of the hash map: "+hash_map.size());
    }
}

// code of  count the number of key-value (size) mappings in a map