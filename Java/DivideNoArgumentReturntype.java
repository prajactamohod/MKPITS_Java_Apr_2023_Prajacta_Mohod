class DivideNoArgumentReturntype{
public int division(){
int number1=50,number2=5;
return number1/number2;
}
public static void main(String[]args){
DivideNoArgumentReturntype div=new DivideNoArgumentReturntype();
int sum=div.division();
System.out.println("division of two number="+sum);
}
}