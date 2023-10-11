package linkedlist_practice_programs;


import java.util.*;

public class LinkedList_Practice_Program_13{
    public static void main(String[] args) {
        // create an empty linked list

        LinkedList <String> element = new LinkedList <String> ();
        element.add("Prajacta");
        element.add("Prince");
        element.add("Piyush");
        element.add("Priya");
        element.add("Pooja");
        System.out.println("Original linked list: " + element);

        // Retrieve but does not remove, the first element of a linked list

        String firstelement = element.peekFirst();     //firstelement--2 object
        System.out.println("First element in the list: " + firstelement);
        System.out.println("Original linked list: " + element);
    }
}