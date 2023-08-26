//inserted the specified element at the specified position in the linked list.




import java.util.LinkedList;
public class InsertElement {
    public static void main(String[] args) {
        // creating linklist
        LinkedList <String> linked_list = new LinkedList <String> ();   //add() is creat
        System.out.println("Original linked list: ");
        linked_list.add("Priya");
        linked_list.add("Pooja");
        linked_list.add("Prajacta");
        linked_list.add("Payal");
        linked_list.add("Prachi");
        System.out.println(linked_list);
        System.out.println("Moon Is Added After Prajacta: " + linked_list);
        linked_list.add(1, "Rutuja");
        // print the list
        System.out.println("The linked list:" + linked_list);
    }
}