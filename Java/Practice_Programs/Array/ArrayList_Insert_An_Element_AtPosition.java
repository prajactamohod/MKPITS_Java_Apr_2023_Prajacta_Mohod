
import java.util.*;
public class ArrayList_Insert_An_Element_AtPosition {
    public static void main(String[] args) {
        // Creae a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Insert_An_Element_Bell");
        list_Strings.add("Insert_An_Element_Fan");
        list_Strings.add("Insert_An_Element_DinnerTable");
        list_Strings.add("Insert_An_Element_SmartTV");
        list_Strings.add("Insert_An_Element_Watches");
        // Print the list
        System.out.println(list_Strings);
        // Now insert a color at the first and last position of the list
        list_Strings.add(0, "Wardrop");
        list_Strings.add(5, "Furniture");
        // Print the list
        System.out.println(list_Strings);
    }
}