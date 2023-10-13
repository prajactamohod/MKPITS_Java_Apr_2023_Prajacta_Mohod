package collection_treeset_practice_programs;

import java.util.TreeSet;
public class Collection_TreeSet_Practice_3 {
    public static void main(String[] args) {
        TreeSet<String> tree_set_first = new TreeSet<String>();
        tree_set_first.add("Samsung");
        tree_set_first.add("Vivo");
        tree_set_first.add("Nokia");
        System.out.println("Tree set_First: "+tree_set_first);
        TreeSet<String> tree_set_second = new TreeSet<String>();
        tree_set_second.add("Honour");
        tree_set_second.add("Lenovo");
        tree_set_second.add("Apple");
        System.out.println("Tree set2: "+tree_set_second);
        // adding treetwo to treeone
        tree_set_first.addAll(tree_set_second);
        System.out.println("Tree set1: "+tree_set_first);
    }
}


// code to add all the elements of a specified tree set to another tree set.



