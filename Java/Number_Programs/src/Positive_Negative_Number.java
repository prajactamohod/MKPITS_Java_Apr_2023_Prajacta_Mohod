import java.util.Random;
import java.util.Scanner;

public class Positive_Negative_Number{
        public static void main (String[]args) {
            try (Scanner scanner = new Scanner(System.in)) {
                Random rand_number = new Random();

                System.out.println("Enter the maximum range:");
                int maxRange = scanner.nextInt();

                for (int loop = 1; loop <= 10; loop++) {
                    System.out.println(rand_number.nextInt(maxRange));
                }
            }
        }
}
