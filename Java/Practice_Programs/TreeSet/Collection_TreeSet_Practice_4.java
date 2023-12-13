package collection_treeset_practice_programs;

import java.util.TreeSet;
import java.util.Iterator;
public class Collection_TreeSet_Practice_4 {
    public static void main(String[] args) {
        // create an empty tree set
        TreeSet<String> t_set = new TreeSet<String>();

        // use add() method to add values in the tree set
        t_set.add("Reena");
        t_set.add("Pallavi");
        t_set.add("Priya");
        t_set.add("Pooja");
        t_set.add("Anaya");

        // print original list

        System.out.println("Original tree set:" + t_set);

        Iterator it = t_set.descendingIterator();
        // Print list elements in reverse order

        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

// code to create a reverse order view of the elements contained in a given tree set