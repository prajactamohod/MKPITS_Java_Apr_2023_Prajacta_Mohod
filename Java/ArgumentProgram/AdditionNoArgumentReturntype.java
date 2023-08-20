class AdditionNoArgumentReturntype{
public int addition(){
int number1=20,number2=3;
return number1+number2;
}
public static void main(String[]args){
AdditionNoArgumentReturntype add=new AdditionNoArgumentReturntype();
int sum=add.addition();
System.out.println("addition of two number="+sum);
}
}