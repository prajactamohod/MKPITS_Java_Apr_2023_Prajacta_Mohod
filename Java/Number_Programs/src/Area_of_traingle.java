import java.util.Random;
import java.util.Scanner;

public class Area_of_traingle {
    public static void main(String[]args){
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("enter the width of the Traingle:");

            double base= scanner.nextDouble();

            System.out.println("Enter the height of the Traingle:");
            double height=scanner.nextDouble();

            // area=(width*height)/2
            double area=(base*height)/2;
            System.out.println("Area of Traingle is:"+area);

        }
    }
}