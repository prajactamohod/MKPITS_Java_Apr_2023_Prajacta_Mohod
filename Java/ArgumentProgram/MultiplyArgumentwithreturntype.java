class MultiplyArgumentwithreturntype{
//Argumentwithreturntype-------------
public int Multiply (int number1,int number2){
return number1+number2;
}
public static void main(String[]args){
MultiplyArgumentwithreturntype cal=new MultiplyArgumentwithreturntype();
int mul=cal.Multiply(82,22);
System.out.println("sum of two number="+mul);
}
}