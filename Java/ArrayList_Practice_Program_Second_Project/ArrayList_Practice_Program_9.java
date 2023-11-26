package arraylist_practice_program;

import java.util.*;
public class ArrayList_Practice_Program_9 {
    public static void main(String[] args) {
        List<String> List1 = new ArrayList<String>();
        List1.add("Ranking First");
        List1.add("Ranking Second");
        List1.add("Ranking Third");
        List1.add("Ranking Forth");
        System.out.println("List1: " + List1);
        List<String> List2 = new ArrayList<String>();
        List2.add("Prajacta");
        List2.add("Priyanka");
        List2.add("Ankita");
        List2.add("Shalini");
        System.out.println("List2: " + List2);
        // Copy List2 to List1
        Collections.copy(List1, List2);
        System.out.println("Copy List to List2,\nAfter copy:");
        System.out.println("List1: " + List1);
        System.out.println("List2: " + List2);
    }
}