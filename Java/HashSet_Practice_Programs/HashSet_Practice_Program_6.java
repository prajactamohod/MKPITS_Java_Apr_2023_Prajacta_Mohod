package hashset_practice_program;

import java.util.*;

public class HashSet_Practice_Program_6 {
    public static void main(String[] args) {

        // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();

        // use add() method to add values in the hash set
        h_set.add("Prajacta");
        h_set.add("Priya");
        h_set.add("Pooja");
        h_set.add("Prachi");
        h_set.add("Pratik");
        h_set.add("Priya");
        System.out.println("Original Hash Set: " + h_set);
        HashSet <String> new_h_set = new HashSet <String> ();
        new_h_set = (HashSet)h_set.clone();
        System.out.println("Cloned Hash Set: " + new_h_set);
    }
}


// code to clone a hash set to another hash set.