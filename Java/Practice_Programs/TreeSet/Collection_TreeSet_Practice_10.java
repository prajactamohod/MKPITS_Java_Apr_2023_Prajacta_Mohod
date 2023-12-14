package collection_treeset_practice_programs;

import java.util.TreeSet;
import java.util.Iterator;

public class Collection_TreeSet_Practice_10 {
    public static void main(String[] args) {
        // creating TreeSet
        TreeSet <Integer>tree_number = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_number.add(10);
        tree_number.add(22);
        tree_number.add(36);
        tree_number.add(25);
        tree_number.add(16);
        tree_number.add(70);
        tree_number.add(82);
        tree_number.add(89);
        tree_number.add(14);

        System.out.println("Greater than or equal to 86 : "+tree_number.ceiling(86));
        System.out.println("Greater than or equal to 29 : "+tree_number.ceiling(29));
    }
}

//code of get the element in a tree set which is greater than or equal to the given element