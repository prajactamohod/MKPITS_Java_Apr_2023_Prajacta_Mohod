package linkedlist_practice_programs;

import java.util.*;

public class LinkedList_Practice_Program_8{
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList <String> l_list = new LinkedList <String> ();
        // use add() method to add values in the linked list
        l_list.add("Reading");
        l_list.add("Graph");
        l_list.add("Boarding");
        l_list.add("Painting");
        l_list.add("Defination");
        // print the list
        System.out.println("The Original linked list: " + l_list);

        //Swapping 1st(index 0) element(Red) with the 3rd(index 2) element (Black)
        Collections.swap(l_list, 0, 2);
        System.out.println("The New linked list after swap: " + l_list);
    }
}