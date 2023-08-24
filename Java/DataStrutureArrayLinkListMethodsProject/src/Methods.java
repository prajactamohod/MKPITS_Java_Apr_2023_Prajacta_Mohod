import java.sql.Array;
import java.util.*;
import java.util.ArrayList;


public class Methods {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(45);
        list.add(90);
        list.add(67);

        list.add("Prajacta");
        System.out.println("Printing an object as whole");
        System.out.println(list);
        System.out.println("Using for Loop");
        for (int elementNumber = 0; elementNumber < list.size(); elementNumber++) {
            System.out.println(list.get(elementNumber));

        }

        //for each is used for same data types and its work faster then for loop.
        System.out.println("by using foreach loop");
        for ( Object number : list) {
            System.out.println(number);

            //using Iterator for replacing the value
            System.out.println("Using iterator");
            list.set(2, "Sakshi");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }


        }


    }
}
