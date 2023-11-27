package arraylist_practice_program;


import java.util.*;
public class ArrayList_Practice_Program_2 {

    public static void main(String[] args) {

        // Createing a list
        List<String> list_Strings = new ArrayList<String>();

        list_Strings.add("Prajacta_Mohod");
        list_Strings.add("Arnav_Singh");
        list_Strings.add("Gurukirat_Oberoi");
        list_Strings.add("Pallivi_Samjwar");
        list_Strings.add("Samiksha_Padole");

        // Print the list

        for (String element : list_Strings) {
            System.out.println(element);
        }
    }
}

// to iterate through all elements in an array list