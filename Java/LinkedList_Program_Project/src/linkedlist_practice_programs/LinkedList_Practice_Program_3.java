package linkedlist_practice_programs;

import java.util.LinkedList;
import java.util.Iterator;
public class LinkedList_Practice_Program_3{
    public static void main(String[] args) {
        // create an empty linked list

        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list

        l_list.add("Prajacta");
        l_list.add("Priyanka");
        l_list.add("Piyush");
        l_list.add("Payal");
        l_list.add("Prince");
// set Iterator at specified index

        Iterator p = l_list.listIterator(1);

        // print list from second position
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}