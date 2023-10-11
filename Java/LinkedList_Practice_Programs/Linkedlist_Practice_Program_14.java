package linkedlist_practice_programs;

import java.util.*;

class LinkedList_Practice_Program_14{
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList <String> element = new LinkedList <String> ();
        element .add("Red");
        element .add("Green");
        element .add("Black");
        element .add("White");
        element .add("Pink");
        System.out.println("Original linked list: " + element );
        // Retrieve but does not remove, the last element of a linked list
        String lastelement  = element .peekLast();
        System.out.println("Last element in the list: " + lastelement );
        System.out.println("Original linked list: " + element );

    }
}