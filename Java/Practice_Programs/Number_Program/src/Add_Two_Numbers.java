import java.util.Scanner;

public class Add_Two_Numbers {
    public static void main(String[]args){
        int number1,number2,total;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println(("Enter First Number:"));
            number1=sc.nextInt();
            System.out.println(("Enter the Second Number:"));
            number2=sc.nextInt();
            total=number1+number2;
            System.out.println("Total of these numbers is:"+total);
        }
    }
}
