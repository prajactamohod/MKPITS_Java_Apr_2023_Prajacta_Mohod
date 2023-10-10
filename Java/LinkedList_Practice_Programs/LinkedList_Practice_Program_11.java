package linkedlist_practice_programs;

import java.util.*;
public class LinkedList_Practice_Program_11 {
    public static void main(String[] args) {
        // create an empty linked list

        LinkedList <String> copy = new LinkedList <String> ();
        copy.add("Prajacta");
        copy.add("Payal");
        copy.add("Prince");
        copy.add("Pooja");
        copy.add("Prachi");
        System.out.println("Original linked  list: " + copy);
        LinkedList <String> newcopy = new LinkedList <String> ();
        newcopy = (LinkedList)copy.clone();
        System.out.println("Cloned linked list: " + newcopy);
    }
}
