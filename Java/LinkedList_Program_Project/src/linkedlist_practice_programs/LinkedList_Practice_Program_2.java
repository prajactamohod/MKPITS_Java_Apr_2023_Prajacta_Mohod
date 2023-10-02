package linkedlist_practice_programs;

import java.util.LinkedList;
public class LinkedList_Practice_Program_2 {

    public static void main(String[] args) {
        // create an empty linked list

        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list

        l_list.add("Noble");
        l_list.add("Citizen");
        l_list.add("Proud");
        l_list.add("Indian");
        l_list.add("Best People");

        // Print the linked list
        for (String element : l_list) {
            System.out.println(element);
        }
    }
}