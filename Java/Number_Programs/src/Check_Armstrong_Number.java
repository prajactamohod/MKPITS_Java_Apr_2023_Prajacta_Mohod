import java.util.Scanner;

public class Check_Armstrong_Number {
    public static void main(String[]args){
        try (Scanner scanner=new Scanner(System.in)){
            int variable,total=0;
            System.out.println("Enter 3 digit number :");
            int statement_number=scanner.nextInt();
            int number= statement_number;

            for(; number !=0;number /=10){
                variable=number%10;
                total=total+variable*variable*variable;

            }
            if(total==statement_number){
                System.out.println(statement_number +"Armstrong number");
            }
            else{
                System.out.println(statement_number+"is not an Armstrong number");
            }
        }
    }
}
