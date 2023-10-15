package collection_treeset_practice_programs;

import java.util.TreeSet;
public class Colllection_TreeSet_Practice_2 {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Prajacta");
        tree_set.add("Prachi");
        tree_set.add("Payal");
        tree_set.add("Reena");
        tree_set.add("Sejal");
        // Print the tree list
        for (String element : tree_set) {
            System.out.println(element);
        }
    }
}
