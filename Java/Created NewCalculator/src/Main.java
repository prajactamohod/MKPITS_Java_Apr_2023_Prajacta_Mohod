import calsi.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation s;
        System.out.println("enter the choice number");
        System.out.println("choice 1, choice 2, choice 3,choice 4");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            s = new Addittion();
            System.out.println("enter the two number : ");
            System.out.println(s.getCalculation(sc.nextInt(),sc.nextInt()));
            break;
            case 2:
                s = new Substraction();
                System.out.println("Enter the two numbers : ");
                System.out.println(   s.getCalculation(sc.nextInt(),sc.nextInt()));
                break;
            case 3:
                s = new Multiplication();
                System.out.println("enter the two number : ");
                System.out.println(   s.getCalculation(sc.nextInt(),sc.nextInt()));
                break;
            case 4:
                s = new Division();
                System.out.println("enter the two number : ");
                System.out.println(   s.getCalculation(sc.nextInt(),sc.nextInt()));
                break;
            default:
                System.out.println("entered choice is invalid");
        }
    }
}
