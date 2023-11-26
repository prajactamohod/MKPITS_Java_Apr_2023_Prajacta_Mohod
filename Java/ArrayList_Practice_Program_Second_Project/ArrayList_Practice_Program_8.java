package arraylist_practice_program;

import java.util.*;
public class  ArrayList_Practice_Program_8{
    public static void main(String[] args) {
        // Creating the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Hello I am Prajacta");
        list_Strings.add("Hello I am Priynaka");
        list_Strings.add("Hello I am Diya ");
        list_Strings.add("Hello I am Kanika");
        list_Strings.add("Hello I am Kriti");
        System.out.println("List before sort: "+list_Strings);
        Collections.sort(list_Strings);
        System.out.println("List after sort: "+list_Strings);
    }
}