package arraylist_practice_program;

import java.util.*;
public class ArrayList_Practice_Program_3 {

    public static void main(String[] args) {

        // Creating a list

        List<String> list_Strings = new ArrayList<String>();

        list_Strings.add("Sahil Singh");
        list_Strings.add("Diya kapoor");
        list_Strings.add("Subhana khan");
        list_Strings.add("Samiksha Padole");
        list_Strings.add("Saloni Pachmiya");

        // Print the list

        System.out.println(list_Strings);


        list_Strings.add(0, "Kiya Kapoor");
        list_Strings.add(5, "Nehal Singh");

        // Print the list
        System.out.println(list_Strings);
    }
}

// code to  inserting an element into the array list at the first position
