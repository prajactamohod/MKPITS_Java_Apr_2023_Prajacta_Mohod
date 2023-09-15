import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfEvenNumbers {


    public class SumofNumber {
        public static void main(String[] args) {

            List<String> cities = Arrays.asList("Wardha", "Amravati", "Banglore", "Hyedrabad", "Nagpur", "Ahemdabad", "Kerela", "Pune", "Jalgao", "Mumbai");


            List<Integer> numbers = Arrays.asList(43, 45, 7, 12, 65, 44, 90);
            List list1 = numbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
            System.out.println(list1);

            //Sum Of Even Numbers
            int sumOfevenNumbers = numbers.stream().filter(n -> n % 2 == 0).reduce(0, (sum, n) -> sum + n);
            System.out.println(sumOfevenNumbers);
        }
    }
}
