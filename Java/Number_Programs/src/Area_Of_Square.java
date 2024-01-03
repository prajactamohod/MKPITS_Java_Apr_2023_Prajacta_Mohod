import java.util.Scanner;

public class Area_Of_Square {
    public static void main(String[]args){
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("Enter side of square:");
            //storing the captured value in a variable
            double side=scanner.nextDouble();
            //Area of square=side*side
            double area=side*side;
            System.out.println("Area of square is:"+area);
        }
    }
}
