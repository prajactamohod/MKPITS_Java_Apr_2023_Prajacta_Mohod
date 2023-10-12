package hashset_practice_program;

import java.util.*;

public class HashSet_Practice_Program_4 {
    public static void main(String[] args) {

        // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();

        // use add() method to add values in the hash set
        h_set.add("Reena");
        h_set.add("Ojas");
        h_set.add("Shruti");
        h_set.add("Samiksha");
        h_set.add("Saloni");
        h_set.add("Priyanka");
        System.out.println("Original Hash Set: " + h_set);

        // Remove all elements
        h_set.removeAll(h_set);
        System.out.println("Hash Set after removing all the elements "+h_set);
    }
}

//programing of an empty an hash set.