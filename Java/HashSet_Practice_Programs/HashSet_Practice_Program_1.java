package hashset_practice_program;

import java.util.HashSet;
public class HashSet_Practice_Program_1 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Prajacta");
        h_set.add("Prince");
        h_set.add("Piyush");
        h_set.add("Pooja");
        h_set.add("Payal");
        h_set.add("Priya");

        // printing the hash set
        System.out.println("The Hash Set: " + h_set);
    }
}