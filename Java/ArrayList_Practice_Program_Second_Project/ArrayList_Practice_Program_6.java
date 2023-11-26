package arraylist_practice_program;


import java.util.*;
public class ArrayList_Practice_Program_6 {

    public static void main(String[] args) {

        // Create a list and add elements to the list

        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Neha Thakur");
        list_Strings.add("Kiya Kapoor");
        list_Strings.add("Jiya Sharma");
        list_Strings.add("Ana Puri");
        list_Strings.add("Sahil Dahiya");

        // Print the list
        System.out.println(list_Strings);

        // Remove the third element from the list.

        list_Strings.remove(2);

        // Printing the list again
        System.out.println("After removing third element from the list:\n"+list_Strings);
    }
}

// code to remove the third element from an array list