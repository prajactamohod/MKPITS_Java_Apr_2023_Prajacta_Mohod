import java.util.LinkedList;
import java.util.Iterator;
public class LinkedList_Practice_Program_7 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Reading");
        l_list.add("Grading");
        l_list.add("Scanner");
        l_list.add("Painting");
        l_list.add("Jiya");

        // print original list
        System.out.println("Original linked list:" + l_list);

        // Find first element of the List
        Object first_element = l_list.getFirst();
        System.out.println("First Element is: "+first_element);

        // Find last element of the List
        Object last_element = l_list.getLast();
        System.out.println("Last Element is: "+last_element);
    }
}