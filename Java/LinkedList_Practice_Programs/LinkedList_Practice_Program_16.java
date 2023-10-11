package linkedlist_practice_programs;


import java.util.*;

public class LinkedList_Practice_Program_16 {
    public static void main(String[] args) {
        // create an empty linked list

        LinkedList <String> linked_list = new LinkedList <String> ();
        linked_list.add("Prajacta");
        linked_list.add("Prince");
        linked_list.add("Payal");
        linked_list.add("Pooja");
        linked_list.add("Piyush");
        System.out.println("Original linked list: " + linked_list);

        //Convert a linked list to array list
        List<String> list = new ArrayList<String>(linked_list);

        for (String str : list){
            System.out.println(str);
        }
    }
}