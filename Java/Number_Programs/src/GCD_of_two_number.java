import java.util.Scanner;

public class GCD_of_two_number {
    public static void main(String[]args){
        try(Scanner scanner=new Scanner(System.in)){
            int number1,number2;
            System.out.println("Enter the first number:");
            number1=(int) scanner.nextInt();

            System.out.println("Enter seconf number:");
            number2=(int) scanner.nextInt();

            //closing the scanner to avoid memory leaks
            scanner.close();
            while (number1!=number2){
                if(number1>number2)
                    number1=number1-number2;
                else number2=number2-number1;

            }
            //displayinh the result
            System.out.printf("GCD of the given numbers is:%d",number2);
        }
    }
}
