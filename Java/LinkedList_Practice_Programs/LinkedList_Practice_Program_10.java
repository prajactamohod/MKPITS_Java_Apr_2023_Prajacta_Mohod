package linkedlist_practice_programs;

import java.util.*;
public class LinkedList_Practice_Program_10 {
    public static void main(String[] args) {

        // create an empty linked list
        LinkedList <String> join = new LinkedList <String> ();

        join.add("Prajacta");
        join.add("Prince");
        join.add("Piyush");
        join.add("Prachi");
        join.add("Pratik");
        System.out.println("List of first linked list: " + join);
        LinkedList <String> joined = new LinkedList <String> ();//joined 2 object
        joined.add("Rutuja");
        joined.add("Navi");
        joined.add("Payal");
        joined.add("Pooja");
        System.out.println("List of second linked list: " + joined);

        // Let join above two list
        LinkedList <String> a = new LinkedList <String> ();
        a.addAll(join);                // join object
        a.addAll(joined);              // joined 2 object
        System.out.println("New linked list: " + a);
    }
}