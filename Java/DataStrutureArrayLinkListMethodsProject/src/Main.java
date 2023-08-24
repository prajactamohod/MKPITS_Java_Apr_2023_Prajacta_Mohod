
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;


import static java.lang.System.*;
import static java.util.Arrays.fill;


public class Main {
    public static void main(String[] args) {
        int arrNum[] = {34, 54, 66, 78, 102};//array Declared


        Arrays.sort(arrNum);// For Sorting

        System.out.println(Arrays.binarySearch(arrNum, 54));//method

        for (int number : arrNum) {
            System.out.println(number);  //To print array

        }
        double arrNumber[] = {30.78, 45.98, 34.87, 28.67, 45.34};
        Arrays.sort(arrNumber);
        System.out.println("\nPrinting the Double Array ");
        System.out.println(Arrays.binarySearch(arrNumber, 30.78));
        for (double number1 : arrNumber) {
            out.println(number1);
        }
        int arrCam[] = {34, 54, 66, 78, 102};  // Same Numbers are there availble therefore the output in 0
        Arrays.sort(arrCam);
        System.out.println("\nCamparing Number");
        System.out.println(Arrays.compare(arrNum, arrCam));
        for (int number2 : arrCam) {
            System.out.println(number2);
        }


    }
}



