import java.util.*;
public class ArrayList_Retrieve_An_element{
    public static void main(String[] args) {
        // Creae a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Amaravti");
        list_Strings.add("Nagpur");
        list_Strings.add("Kolkata");
        list_Strings.add("Kashmir");
        list_Strings.add("Bangal");
        // Print the list
        System.out.println(list_Strings);
        // Retrive the first and third element
        String element = list_Strings.get(0);
        System.out.println("First element: "+element);
        element = list_Strings.get(2);
        System.out.println("Third element: "+element);
    }
}