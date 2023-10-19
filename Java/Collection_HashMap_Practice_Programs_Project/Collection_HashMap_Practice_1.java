package collection_hashmap_practice_program;

import java.util.*;
public class Collection_HashMap_Practice_1 {
    public static void main(String args[]) {

        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1, "Shanti_Nagar");
        hash_map.put(2, "Mayur_Viahr");
        hash_map.put(3, "Shashi_Nagar");
        hash_map.put(4, "Forest_Colony");
        hash_map.put(5, "Professor_Colony");

        for(Map.Entry x:hash_map.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}

// code  associate the specified value with the specified key in a HashMap.