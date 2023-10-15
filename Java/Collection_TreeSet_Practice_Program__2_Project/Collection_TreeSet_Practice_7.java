package collection_treeset_practice_programs;

import java.util.TreeSet;
import java.util.Iterator;

public class Collection_TreeSet_Practice_7 {
    public static void main(String[] args) {
        // create an empty tree set

        TreeSet<String> t_set = new TreeSet<String>();
        // use add() method to add values in the tree set

        t_set.add("Priya");
        t_set.add("Prajacta");
        t_set.add("Payal");
        t_set.add("Kajal");
        t_set.add("Reena");
        System.out.println("Original tree set: " + t_set);
        System.out.println("Size of the tree set: " + t_set.size());
    }
}