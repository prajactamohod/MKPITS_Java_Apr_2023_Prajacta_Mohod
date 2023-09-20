import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(43, 45, 7, 12, 65, 44, 90);
        List list1 = numbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);

    }
}