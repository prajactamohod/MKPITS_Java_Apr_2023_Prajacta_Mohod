package hashset_practice_program;


import java.util.*;

public class HashSet_Practice_Program_5{
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> h_set = new HashSet();
        // use add() method to add values in the hash set
        h_set.add("Live as if you were to die tomorrow ");
        h_set.add("It always seems impossible until it's done");
        h_set.add("The time is always right to do what is right");
        h_set.add("Because you are alive, everything is possible");
        h_set.add("Simplicity is the ultimate sophistication");
        h_set.add("It is never too late to be what you might have been");

        System.out.println("Original Hash Set: " + h_set);

        System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());

        System.out.println("Remove all the elements from a Hash Set: ");

        h_set.removeAll(h_set);
        System.out.println("Hash Set after removing all the elements "+h_set);
    }
}

// condition to test if a hash set is empty or not.