import java.util.Scanner;

public class Prime_Number {
    public static void main(String[]args){
        try(Scanner scanner=new Scanner(System.in)){
            boolean isPrime=true;
            System.out.println("Enter any number :");
            //captured the input in an integer
            int number=scanner.nextInt();
            for(int count=2;count <=number/2;count++){
                int condition_variable=number% count;
                if(condition_variable==0){
                    isPrime=false;
                    break;

                }
            }
            // if isPrime is true then the number is prime elase not
            if(isPrime){
            System.out.println(number +"is a prime number");
            }else{
                System.out.println(number +"is not a prime number");
            }
        }
    }
}
