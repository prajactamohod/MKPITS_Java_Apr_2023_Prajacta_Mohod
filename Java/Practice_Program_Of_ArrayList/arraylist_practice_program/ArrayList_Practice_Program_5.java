package arraylist_practice_program;

import java.util.*;
public class ArrayList_Practice_Program_5 {

    public static void main(String[] args) {

        // Create a list and add elements

        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Neha Thakur");
        list_Strings.add("Prajacta Mohod");
        list_Strings.add("Rutuja Sonone");
        list_Strings.add("Riya Kapoor");
        list_Strings.add("Anikta Lokhande");

        // Print the list
        System.out.println(list_Strings);

        // Update the third element
        list_Strings.set(2, "Aahana Singh");
        // Print the list again
        System.out.println(list_Strings);
    }
}

// code of update an array element by the given element