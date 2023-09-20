import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.*;
public class InfiniteAndFlatMappingClass {
    public static void main(String[] args) {

        //Infinite Stream
        Random random = new Random();
        IntStream randStream = random.ints(10);
        randStream.forEach(System.out::println);

        //Flat Mapping
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3, 67),
                Arrays.asList(3, 6, 7, 3),
                Arrays.asList(8, 5, 84, 7)
        );
        int sum = listOfLists.stream()
                .flatMap(list -> list.stream())
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of all numbers:" + sum);
    }
}