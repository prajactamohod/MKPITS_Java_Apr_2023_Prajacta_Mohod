class MultiplicationOverloading{

public long multiplication(long number1 ,long number2 ,long number3){
 return number1*number2*number3;
}
public long multiplication(long number1, long number2, long number3,long number4){
return number1*number2*number3*number4;
}

public static void main(String[] args){
 MultiplicationOverloading multiply =new MultiplicationOverloading();
  long MULTIPLY= multiply.multiplication(45,98,34);
  System.out.println("multiplicationof three number=" + MULTIPLY);
  long MULTIPLY1 = multiply.multiplication(4,23,45,56);
  System.out.println("multiplication of four number=" + MULTIPLY1);

}
}