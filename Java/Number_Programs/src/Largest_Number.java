import java.util.Scanner;

public class Largest_Number {
    public static void main(String[]args){
        try(Scanner scanner=new Scanner(System.in)){
            int number1,number2,number3;
            System.out.println("Enter first number:");
            number1=(int) scanner.nextInt();

            System.out.println("Enter second number:");
            number2=(int) scanner.nextInt();

            System.out.println("Enter Third number");
            number3=(int) scanner.nextInt();

            if(number2>number1 && number2>=number3){
                System.out.println((number2 +"is the largest number"));

            } else if (number2>number1 && number2>=number3) {
                System.out.println(number2 +"is the largest Number");



            } else  {
                System.out.println(number3 +"is the largest number");

            }
        }
    }

}
