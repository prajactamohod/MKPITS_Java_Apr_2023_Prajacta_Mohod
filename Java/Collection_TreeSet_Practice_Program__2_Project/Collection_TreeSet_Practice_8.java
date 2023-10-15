package collection_treeset_practice_programs;

import java.util.TreeSet;

import java.util.Iterator;

public class Collection_TreeSet_Practice_8 {
    public static void main(String[] args) {
        // Create a empty tree set
        TreeSet<String> t_set_first = new TreeSet<String>();
        // use add() method to add values in the tree set
        t_set_first.add("Reena");
        t_set_first.add("Prajacta");
        t_set_first.add("Pranay");
        t_set_first.add("Prajwal");

        System.out.println("Free Tree set: " + t_set_first);

        TreeSet<String> t_set_second = new TreeSet<String>();
        t_set_second.add("Priya");
        t_set_second.add("Ria");
        t_set_second.add("Dipli");
        t_set_second.add("Diya");
        System.out.println("Second Tree set: " + t_set_second);
        //comparison output in tree set
        TreeSet<String> result_set = new TreeSet<String>();
        for (String element : t_set_first) {
            System.out.println(t_set_second.contains(element) ? "Yes" : "No");
        }
    }
}


//code of compare two tree sets