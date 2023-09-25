
import java.util.*;
import java.util.stream.Collectors;


public class FilteringAndCollectingClass  {
    public static void main (String args[]) {

        //filtering
        List<String>cities=Arrays.asList("Manali","Kashmir","Ladakh");
        cities.stream().filter(c->c.startsWith("A")).forEach(System.out::println);


        //collecting
        List list=cities.stream().filter(c->c.startsWith("A")).collect(Collectors.toList());
        System.out.println(list);
    }

}

