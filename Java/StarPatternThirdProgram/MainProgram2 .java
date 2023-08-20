import java.util.Scanner;

public class MainProgram2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter lower half number : ");
        int number2 = scanner.nextInt();
        

        MainProgram2 downRightAngleLowerHalf = new MainProgram2();
        downRightAngleLowerHalf.downRightAngleLowerHalf(number2);
    }
}