package arraylist_practice_program;

import java.util.*;
public class ArrayList_Practice_Program_11 {
    public static void main(String[] args) {
        // Creating a list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Ranking The First Position");
        list_Strings.add("Ranking the Second Position");
        list_Strings.add("Ranking the Third Position");
        list_Strings.add("Ranking the Forth Position");
        list_Strings.add("Ranking thr Five Position");
        System.out.println("List before reversing :\n" + list_Strings);
        Collections.reverse(list_Strings);
        System.out.println("List after reversing :\n" + list_Strings);
    }
}