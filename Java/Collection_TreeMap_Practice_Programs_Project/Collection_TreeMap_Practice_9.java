package collection_treemap_practice_program;

import java.util.*;
import java.util.Map.Entry;
public class Collection_TreeMap_Practice_9 {
    public static void main(String args[]) {

        // Create a tree map
        TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();

        // Put elements to the map
        tree_map1.put("element_2", "Model_No_Vivo_V_19");
        tree_map1.put("element_1", "Model_No_Vivo_V_27");
        tree_map1.put("element_4", "Model_No_Oneplus_11");
        tree_map1.put("element_3", "Model_No_Lenovo_kNote_8");

        System.out.println("Orginal TreeMap content: " + tree_map1);
        System.out.println("Reverse order view of the keys: " + tree_map1.descendingKeySet());
    }
}
// code  to get a reverse order view of the keys contained in a given map