package linkedlist_practice_programs;

import java.util.LinkedList;
import java.util.Collections;
public class LinkedList_Practice_Program_18 {
    public static void main(String[] args) {
        LinkedList<String> first_element= new LinkedList<String>();
        first_element.add("Prajacta");
        first_element.add("Prince");
        first_element.add("Pooja");
        first_element.add("Priya");
        first_element.add("Payal");
        System.out.println("Original linked list: " + first_element);
        System.out.println("Let's check the above linked list is empty or not! "+first_element.isEmpty());
        first_element.removeAll(first_element);

        System.out.println("Linked list after removing all elements "+first_element);

        System.out.println("Check the above linked list is empty or not! "+first_element.isEmpty());
    }
}