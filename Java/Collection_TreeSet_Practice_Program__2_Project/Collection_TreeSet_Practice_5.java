package collection_treeset_practice_programs;

import java.util.TreeSet;
public class Collection_TreeSet_Practice_5 {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Prajacta");
        tree_set.add("Payal");
        tree_set.add("Priya");
        tree_set.add("Parchi");
        tree_set.add("Piyush");
        System.out.println("Tree set: ");
        System.out.println(tree_set);

        // Find first element of the tree set
        Object first_element = tree_set.first();
        System.out.println("First Element is: "+first_element);

        // Find last element of the tree set
        Object last_element = tree_set.last();
        System.out.println("Last Element is: "+last_element);
    }
}
// code to to get the first and last elements in a tree set.