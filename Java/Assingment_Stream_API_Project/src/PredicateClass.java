import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateClass {
    public static void main(String[] args) {



        List<Integer> numbers = Arrays.asList(4, 66, 77, 0, 89, 34, 56, 78, 45, 90);
        Predicate<Integer> predicate = n -> n < 10;
        List<Integer> numberSmallerThanTen = numbers.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(numberSmallerThanTen);

    }
    static boolean smallerThanTen(Integer n){
        return n<10;
    }

}

