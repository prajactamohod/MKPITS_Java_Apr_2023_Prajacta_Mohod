import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsClass {
    public static void main(String[] args) {

        List<String>cities=Arrays.asList("Wardha","Amravati","Banglore","Hyedrabad","Nagpur","Ahemdabad","Kerela","Pune","Jalgao","Mumbai");

        List list1 = cities.stream().map(c -> c).collect(Collectors.toList());
        System.out.println(list1);

    }
}