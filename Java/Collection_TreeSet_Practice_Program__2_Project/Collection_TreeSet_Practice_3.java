package collection_treeset_practice_programs;

import java.util.TreeSet;
public class Collection_TreeSet_Practice_3 {
    public static void main(String[] args) {
        TreeSet<String> tree_set1 = new TreeSet<String>();
        tree_set1.add("Prajacta");
        tree_set1.add("Payal");
        tree_set1.add("Priya");
        System.out.println("Tree set_first: "+tree_set1);
        TreeSet<String> tree_set_second = new TreeSet<String>();
        tree_set_second.add("Pallavi");
        tree_set_second.add("Pooja");
        tree_set_second.add("kajal");
        System.out.println("Tree set2: "+tree_set_second);
        // adding treetwo to treeone
        tree_set1.addAll(tree_set_second);
        System.out.println("Tree set1: "+tree_set1);
    }
}