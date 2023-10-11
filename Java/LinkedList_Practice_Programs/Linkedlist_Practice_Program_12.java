package linkedlist_practice_programs;

import java.util.*;
public class Linkedlist_Practice_Program_12 {
    public static void main(String[] args) {
        // create an empty linked list

        LinkedList <String> element = new LinkedList <String> ();
        element.add("Prajacta");
        element.add("Prince");
        element.add("Payal");
        element.add("Piyush");
        element.add("Pooja");
        System.out.println("Original linked  list: " + element);

        System.out.println("Removed element: "+element.pop());

        System.out.println("Linked list after pop operation: "+element);
    }

}

//remove and return the first element of a linked list.