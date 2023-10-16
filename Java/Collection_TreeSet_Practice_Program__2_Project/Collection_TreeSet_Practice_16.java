package collection_treeset_practice_programs;

import java.util.TreeSet;

public class Collection_TreeSet_Practice_16 {
    public static void main(String[] args) {
        // creating TreeSet
        TreeSet <Integer>tree_remove_number = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_remove_number.add(10);
        tree_remove_number.add(22);
        tree_remove_number.add(36);
        tree_remove_number.add(25);
        tree_remove_number.add(16);
        tree_remove_number.add(70);
        tree_remove_number.add(82);
        tree_remove_number.add(89);
        tree_remove_number.add(14);
        System.out.println("Original tree set: "+tree_remove_number);
        System.out.println("Removes 70 from the list: "+tree_remove_number.remove(70));
        System.out.println("Tree set after removing last element: "+tree_remove_number);
    }
}

// code  to remove a given element from a tree set