package linkedlist_practice_programs;


import java.util.LinkedList;
public class LinkedList_Practice_Program_1{

    public static void main(String[] args) {
        // created an empty linked list

        LinkedList<String> l_list = new LinkedList<String>();
        //  add() method to add values in the linked list

        l_list.add("Reading");
        l_list.add("Writing");
        l_list.add("Boating");
        l_list.add("Cooking");
        l_list.add("Painting");
        l_list.add("Playing");

        // print the list
        System.out.println("The linked list: " + l_list);
    }
}