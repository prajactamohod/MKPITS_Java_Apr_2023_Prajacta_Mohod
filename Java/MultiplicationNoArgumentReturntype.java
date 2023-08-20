class MultiplicationNoArgumentReturntype{
public int multiply(){
int number1=76,number2=9;
return number1*number2;
}
public static void main(String[]args){
MultiplicationNoArgumentReturntype mul=new MultiplicationNoArgumentReturntype();
int sum=mul.multiply();
System.out.println("multiply of two number="+sum);
}
}