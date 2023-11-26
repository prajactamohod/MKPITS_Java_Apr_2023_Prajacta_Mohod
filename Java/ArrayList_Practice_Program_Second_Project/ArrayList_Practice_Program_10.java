package arraylist_practice_program;

import java.util.*;
public class ArrayList_Practice_Program_10 {
    public static void main(String[] args) {
        // Creae a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Ranking First");
        list_Strings.add("Ranking Second");
        list_Strings.add("Ranking Third");
        list_Strings.add("Ranking Forth");
        list_Strings.add("Ranking Five");
        System.out.println("List before shuffling:\n" + list_Strings);
        Collections.shuffle(list_Strings);
        System.out.println("List after shuffling:\n" + list_Strings);
    }
}
