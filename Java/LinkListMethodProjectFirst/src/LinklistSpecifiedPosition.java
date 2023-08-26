//iterate through all elements in a linked list starting at the specified position.
import java.util.LinkedList;
public class LinklistSpecifiedPosition {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList <String> linked_list = new LinkedList <String> ();
        // use add() method to add values in the linked list
        linked_list.add("Red");
        linked_list.add("Green");
        linked_list.add("Black");

        // print original list
        System.out.println("Original linked list:" + linked_list);

        // create a new collection and add some elements

        LinkedList <String> new_l_list = new LinkedList <String> ();
        new_l_list.add("White");
        new_l_list.add("Pink");

        // Add the collection in the second position of the existing linked list
        linked_list.addAll(1, new_l_list);

        // print the new list
        System.out.println("Staring Specified Position LinkedList:" + linked_list);
    }
}