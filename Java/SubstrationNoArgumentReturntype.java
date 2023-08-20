class SubstrationNoArgumentReturntype{
public int substract(){
int number1=20,number2=3;
return number1-number2;
}
public static void main(String[]args){
SubstrationNoArgumentReturntype sub=new SubstrationNoArgumentReturntype();
int sum=sub.substract();
System.out.println("substract of two number="+sum);
}
}