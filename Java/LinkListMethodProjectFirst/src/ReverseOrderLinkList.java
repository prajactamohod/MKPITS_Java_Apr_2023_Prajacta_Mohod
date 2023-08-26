//-iterate a linked list in reverse order.
import java.util.LinkedList;
import java.util.Iterator;
public class ReverseOrderLinkList {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linked_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        linked_list.add("Ranking");
        linked_list.add("Glory");
        linked_list.add("Brand");
        linked_list.add("Prajacta");
        linked_list.add("Acquire");

        // print original list
        System.out.println("Original linked list:" + linked_list);

        Iterator it = linked_list.descendingIterator();

        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
