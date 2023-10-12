package hashset_practice_program;

import java.util.*;
public class HashSet_Practice_Program_7 {
    public static void main(String[] args) {
        // Create a empty hash set

        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set

        h_set.add("Prajacta");
        h_set.add("Jiya");
        h_set.add("Natasha");
        h_set.add("Steve");
        h_set.add("Tony");
        h_set.add("Peper");
        System.out.println("Original Hash Set: " + h_set);

        // Creating an Array
        String[] new_array = new String[h_set.size()];
        h_set.toArray(new_array);

        // Displaying Array elements
        System.out.println("Array elements: ");
        for(String element : new_array){
            System.out.println(element);
        }
    }
}


// code  to convert a hash set to an array.