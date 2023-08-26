import java.util.LinkedList;
import java.util.Iterator;
public class IteratorClassMethod{
    public static void main(String[] args) {
        // creating linklist
        LinkedList<String> linked_list = new LinkedList<String>();
        //  add() method to add values in the linked list
        linked_list.add("Ranking");
        linked_list.add("Glory");
        linked_list.add("Queue");
        linked_list.add("Linklist");
        linked_list.add("Prajacta");
// set Iterator at specified index
        Iterator p = linked_list.listIterator(1);

        // print list from second position
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}