import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[]args){

        try(Scanner scanner=new Scanner(System.in)){
            float p,r,t,simple_interest;
            System.out.println("Enter the principal :");
            p=scanner.nextFloat();
            System.out.println("Enter the Rate of interest :");
            r= scanner.nextFloat();
            System.out.println("Enter the Time period :");
            t=scanner.nextFloat();
            simple_interest=(p*r*t)/100;
            System.out.println("Simple interest is :"+simple_interest);
        }
    }
}
