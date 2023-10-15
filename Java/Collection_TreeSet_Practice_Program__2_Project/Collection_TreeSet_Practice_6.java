package collection_treeset_practice_programs;


import java.util.TreeSet;
import java.util.Iterator;

public class Collection_TreeSet_Practice_6 {
    public static void main(String[] args) {

        // create an empty tree set
        TreeSet<String> t_set = new TreeSet<String>();
        // use add() method to add values in the tree set

        t_set.add("Prajacta");
        t_set.add("Shree");
        t_set.add("Angel");
        t_set.add("Pallavi");
        t_set.add("Soniya");

        System.out.println("Original tree set:" + t_set);
        TreeSet<String> new_t_set = (TreeSet<String>)t_set.clone();
        System.out.println("Cloned tree list: " + t_set);
    }
}
// code of clone a tree set list to another tree set