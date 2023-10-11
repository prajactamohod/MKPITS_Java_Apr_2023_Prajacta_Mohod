package linkedlist_practice_programs;

import java.util.*;
public class LinkedList_Practice_Program_17 {
    public static void main(String[] args) {
        LinkedList<String> first_element= new LinkedList<String>();
        first_element.add("Red");
        first_element.add("Green");
        first_element.add("Black");
        first_element.add("White");
        first_element.add("Pink");

        LinkedList<String> second_element= new LinkedList<String>();
        second_element.add("Red");
        second_element.add("Green");
        second_element.add("Black");
        second_element.add("Orange");

        //comparison output in linked list
        LinkedList<String> campared_element = new LinkedList<String>();
        for (String e : first_element)
            campared_element.add(second_element.contains(e) ? "Yes" : "No");
        System.out.println(campared_element);
    }
}