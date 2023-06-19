class SubtrationArgumentNoReturn{
public void substract(int number1,int number2){
int sum=number1-number2;
System.out.println("substract of two numbers"+sum);
}
public static void main(String[]args){
SubtrationArgumentNoReturn sub =new SubtrationArgumentNoReturn();
sub.substract(40,20);
}
}