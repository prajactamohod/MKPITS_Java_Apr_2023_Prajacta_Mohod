import java.util.*;
public class ArrayList_Remove_An_Element {
    public static void main(String[] args) {
        // Creae a list and add some countrys to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("India");
        list_Strings.add("Greek");
        list_Strings.add("Austalia");
        list_Strings.add("Columbia");
        list_Strings.add("Germany");
        // Print the list
        System.out.println(list_Strings);
        // Remove the third element from the list.
        list_Strings.remove(2);
        // Print the list again
        System.out.println("After removing third element from the list:\n"+list_Strings);
    }
}
