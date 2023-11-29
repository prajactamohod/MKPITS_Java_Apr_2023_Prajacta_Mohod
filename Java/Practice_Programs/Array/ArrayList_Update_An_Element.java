import java.util.*;
public class ArrayList_Update_An_Element {
    public static void main(String[] args) {


        // Created a list and add some Countrys to the list

        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("India");
        list_Strings.add("Greek");
        list_Strings.add("Australia");
        list_Strings.add("Italy");
        list_Strings.add("Germany");

        // Printing the list
        System.out.println(list_Strings);

        // Update the third element with "Yellow"
        list_Strings.set(2, "France");

        // Print the list again
        System.out.println(list_Strings);
    }
}
