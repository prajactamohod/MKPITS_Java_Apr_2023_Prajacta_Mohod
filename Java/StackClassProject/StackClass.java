import java.util.Scanner;
import java.util.SortedMap;
import java.util.Stack;


public class StackClass {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        //Added element to the stack
        stack.push(400);
        stack.push(900);
        stack.push(544);
        stack.push(600);
        stack.push(7655);

        //Printing the element to the Stack
        System.out.println(stack);


        //peek element from the stack
        System.out.println(stack.peek());
        String choice;




    }
}