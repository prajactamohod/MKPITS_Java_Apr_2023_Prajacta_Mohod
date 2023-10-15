package collection_treeset_practice_programs;

import java.util.TreeSet;
import java.util.Iterator;

public class Collection_TreeSet_Practice_9 {
    public static void main(String[] args) {
        // creating TreeSet
        TreeSet <Integer>tree_number = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_number.add(1);
        tree_number.add(2);
        tree_number.add(3);
        tree_number.add(5);
        tree_number.add(6);
        tree_number.add(7);
        tree_number.add(8);
        tree_number.add(9);
        tree_number.add(10);

        // Find numbers less than 7
        treeheadset = (TreeSet)tree_number.headSet(7);

        // create an iterator
        Iterator iterator;
        iterator = treeheadset.iterator();

        //Displaying the tree set data
        System.out.println("Tree set data: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}

// code of find numbers less than 7 in a tree set