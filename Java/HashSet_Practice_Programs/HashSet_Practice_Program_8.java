package hashset_practice_program;

import java.util.*;

public class HashSet_Practice_Program_8 {
    public static void main(String[] args) {

        // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();

        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original Hash Set: " + h_set);

        // Create a List from HashSet elements
        List<String> list = new ArrayList<String>(h_set);

        // Display ArrayList elements
        System.out.println("ArrayList contains: "+ list);
    }
}

// code of  convert a hash set to a List/ArrayList