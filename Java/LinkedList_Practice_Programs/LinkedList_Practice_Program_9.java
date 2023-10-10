package linkedlist_practice_programs;

import java.util.*;

public class LinkedList_Practice_Program_9 {
    public static void main(String[] args) {
        // create an empty linked list

        LinkedList <String> l_list = new LinkedList <String> ();
        // use add() method to add values in the linked list

        l_list.add("Prajacta");
        l_list.add("Prince");
        l_list.add("Piyush");
        l_list.add("Pooja");
        l_list.add("Payal");

        // printing the list
        System.out.println("Linked list before shuffling:\n" + l_list);
        Collections.shuffle(l_list);
        System.out.println("Linked list after shuffling:\n" + l_list);
    }
}