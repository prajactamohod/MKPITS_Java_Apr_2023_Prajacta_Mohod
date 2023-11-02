package arraylist_practice_program;

import java.util.*;
public class ArrayList_Practice_Program_7 {

    public static void main(String[] args) {

        // Create a list and add some colors to the list

        List<String> list_Strings = new ArrayList<String>();

        list_Strings.add("Prajacta Mohod");
        list_Strings.add("Sahil Singh");
        list_Strings.add("Prajwal Kapoor");
        list_Strings.add("Subhana Khan");
        list_Strings.add("Samiksha Padole");
        
        // Search the value
        if (list_Strings.contains("Saloni Panchmiya")) {

            System.out.println("Found the element");

        } else {

            System.out.println("There is no such element");
        }
    }
}

// code to search for an element in an array list