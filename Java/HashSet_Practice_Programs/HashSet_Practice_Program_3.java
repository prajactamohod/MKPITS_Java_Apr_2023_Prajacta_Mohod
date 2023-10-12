package hashset_practice_program;

import java.util.*;
import java.util.Iterator;
public class HashSet_Practice_Program_3 {
    public static void main(String[] args) {

        // Creating a empty hash set
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Prince");
        h_set.add("Priya");
        h_set.add("Pooja");
        h_set.add("Payal");
        h_set.add("Prajacta");
        h_set.add("Piyush");
        System.out.println("Original Hash Set: " + h_set);
        System.out.println("Size of the Hash Set: " + h_set.size());
    }
}

//to get the number of elements in a hash set.