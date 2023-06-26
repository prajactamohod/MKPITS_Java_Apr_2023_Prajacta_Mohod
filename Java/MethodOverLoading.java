public class MethodOverLoading{
int method(int number1,int number2){
return number1/number2;
}
int method(int number1,int number2,int number3){
return number1+number2+number3;
}
long method(long number1,long number2){
return number1/number2;
}
public static void main(String[] args){
MethodOverLoading menu =new MethodOverLoading();
int first=menu.method(9,5);
System.out.println("division of two number="+ first);
int second=menu.method(3,7,6);
System.out.println("addition of three number ="+ second);
long third=menu.method(8,9);
System.out.println("division of two number="+ third);
}
}