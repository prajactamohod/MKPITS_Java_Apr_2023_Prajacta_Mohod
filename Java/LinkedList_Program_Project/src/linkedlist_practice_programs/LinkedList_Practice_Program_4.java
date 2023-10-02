package linkedlist_practice_programs;

import java.util.LinkedList;
import java.util.Iterator;
public class LinkedList_Practice_Program_4 {

    public static void main(String[] args) {
        // create an empty linked list

        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list

        l_list.add("English");
        l_list.add("Math");
        l_list.add("Hindi");
        l_list.add("Marathi");
        l_list.add("History");

        // print original list
        System.out.println("Original linked list:" + l_list);

        Iterator it = l_list.descendingIterator();

        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}