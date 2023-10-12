package hashset_practice_program;

import java.util.*;
public class HashSet_Practice_Program_9 {
    public static void main(String[] args) {
        // Create a empty hash set
        HashSet<String> h_set_first = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set_first.add("Railways");
        h_set_first.add("Reading");
        h_set_first.add("Stack");
        h_set_first.add("Queue");

        HashSet<String>h_set_second = new HashSet<String>();
        h_set_second.add("Coding");
        h_set_second.add("Series");
        h_set_second.add("Arilines");
        h_set_second.add("Booking");
        //comparison output in hash set
        HashSet<String>result_set = new HashSet<String>();
        for (String element : h_set_first){
            System.out.println(h_set_second.contains(element) ? "Yes" : "No");
        }
    }
}

//code to compare two hash set 