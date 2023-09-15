import java.util.Arrays;
import java.util.List;

public class AsList {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Wardha", "Amravati", "Banglore", "Hyedrabad", "Nagpur", "Ahemdabad", "Kerela", "Pune", "Jalgao", "Mumbai");
       cities.stream().map(c->c).forEach(System.out::println);
    }
}