package hashset_practice_program;

import java.util.*;
import java.util.Iterator;
public class HashSet_Practice_Program_2 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Prajacta");
        h_set.add("Prince");
        h_set.add("Reena");
        h_set.add("Samiksha");
        h_set.add("Saloni");
        h_set.add("Shweta");

        // set Iterator
        Iterator<String> iterator_element = h_set.iterator();
        // Iterate the hash set
        while (iterator_element.hasNext()) {
            System.out.println(iterator_element.next());
        }
    }
}