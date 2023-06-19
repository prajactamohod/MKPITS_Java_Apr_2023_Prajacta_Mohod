class DivisionArgumentNoReturn{
public void Divide(int number1,int number2){
int sum=number1/number2;
System.out.println("Divide of two numbers"+sum);
}
public static void main(String[]args){
DivisionArgumentNoReturn div =new DivisionArgumentNoReturn();
div.Divide(100,50);
}
}