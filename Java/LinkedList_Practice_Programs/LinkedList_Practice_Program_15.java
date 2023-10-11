package linkedlist_practice_programs;

import java.util.*;
public class LinkedList_Practice_Program_15 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList <String> element = new LinkedList <String> ();
        element.add("Red");
        element.add("Green");
        element.add("Black");
        element.add("White");
        element.add("Pink");
        System.out.println("Original linked list: " + element);

        // Checks whether the color "Green" exists or not.
        if (element.contains("Green")) {
            System.out.println("Color Green is present in the linked list.");
        } else {
            System.out.println("Color Green is not present in the linked list.");
        }

        // Checks whether the color "Orange" exists or not.
        if (element.contains("Orange")) {
            System.out.println("Color Orange is present in the linked list.");
        } else {
            System.out.println("Color Orange is not present in the linked list.");
        }

    }
}