import calsi.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation c;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter choice:");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                c = new Addition();
                System.out.print("enter the numbers :");


                System.out.println(c.calculation(sc.nextInt(), sc.nextInt()));
                break;
            case 2:
                c = new Substraction();
                System.out.print("enter the numbers :");
                System.out.println(c.calculation(sc.nextInt(), sc.nextInt()));
                break;
            

        }
    }
}