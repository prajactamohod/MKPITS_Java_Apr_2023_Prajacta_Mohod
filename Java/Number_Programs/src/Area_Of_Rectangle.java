import java.util.Scanner;

public class Area_Of_Rectangle {
    public static void main(String[]args){
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("Enter the length of Rectangle :");
            double lenght=scanner.nextDouble();
            System.out.println("Enter the width of Rectangle:");
            double width=scanner.nextDouble();
            double area=lenght*width;
            System.out.println("Area of Rectangle is:"+area);

        }
    }
}
