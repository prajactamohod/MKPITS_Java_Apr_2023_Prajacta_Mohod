import java.util.*;
public class ArrayList_Iterate_Element {
    public static void main(String[] args) {
        // Creae a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Iterate_Element_Box");
        list_Strings.add("Iterate_Element_Icons");
        list_Strings.add("Iterate_Element_MobilePhone");
        list_Strings.add("Iterate_Element_Laptop");
        list_Strings.add("Iterate_Element_Shapes");
        // Print the list
        for (String element : list_Strings) {
            System.out.println(element);
        }
    }
}

