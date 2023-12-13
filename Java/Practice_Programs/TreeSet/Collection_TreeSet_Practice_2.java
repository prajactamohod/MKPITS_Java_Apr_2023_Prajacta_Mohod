package collection_treeset_practice_programs;



import java.util.TreeSet;
public class Collection_TreeSet_Practice_2 {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Element_no_1 Intruments");
        tree_set.add("Element_no_2 Pen Boxes");
        tree_set.add("Element_no_3 DinnerSets");
        tree_set.add("Element_no_4 Mobile Boxes");
        tree_set.add("Element_no_5 Camera ");
        // Print the tree list
        for (String element : tree_set) {
            System.out.println(element);
        }
    }
}

//code  to iterate through all elements in a tree set
