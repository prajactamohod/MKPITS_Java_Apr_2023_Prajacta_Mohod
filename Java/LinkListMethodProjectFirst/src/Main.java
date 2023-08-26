//1-append the specified element to the end of a linked list.
 import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linked_list = new LinkedList<String>();
        // use add() method to add(Append) values in the linked list
        linked_list.add("Riya");
        linked_list.add("Glory");
        linked_list.add("Bag");
        linked_list.add("While");
        linked_list.add("Prajacta");
        linked_list.add("Yell");




        System.out.println(linked_list);
        linked_list.addLast(String.valueOf("Bear"));

        // for printing the list
        System.out.println("Printing The Value Add At Last ");
        System.out.println("The linked list: "+ linked_list);

    }
}