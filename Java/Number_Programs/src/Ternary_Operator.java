import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[]args){
        try(Scanner scanner=new Scanner(System.in)){
            int number1,number2,number3,total;
            System.out.println("Enter the first number:");
            number1=(int) scanner.nextInt();


            System.out.println("Enter Second number:");
            number2=(int) scanner.nextInt();


            System.out.println("Enter Third number:");
            number3=(int)scanner.nextInt();

            total=number1<number2 ? number1:number2;
            int result=number3< total?number3:total;
            System.out.println("Smallest Number is:"+result);

        }
    }
}
