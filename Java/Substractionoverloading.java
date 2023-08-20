class Substractionoverloading{
public float Substraction(float number1 ,float number2){
return number1-number2;
}
public float Substraction(float number1 ,float number2 ,float number3){
return number1-number1-number2-number3;
}
public static void main(String[] args){
Substractionoverloading substraction=new Substractionoverloading();
float SUBSTRACTION=substraction.Substraction(4.1f,3.2f,17.0f);
System.out.println(" Substraction of 2number ="+ SUBSTRACTION);
float SUBSTRACTION1= substraction.Substraction(18.1f,26.4f,56.0f);
System.out.println(" Substraction of tow number ="+ SUBSTRACTION1);
}
}