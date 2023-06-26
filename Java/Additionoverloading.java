class Additionoverloading{
 
 public int Addition (int number1 ,int number2){
 return number1+number2;
}
public int Addition(int number1 ,int number2 ,int number3){
return number1+number2+number3;
}
public static void main(String[] args){
Additionoverloading addition=new Additionoverloading();
 int ADDITION=addition.Addition(20,20);
 System.out.println("addition of 2number ="+ADDITION);
 int ADDITION1=addition.Addition(678,456,123);
 System.out.println("Addition of 2 number ="+ ADDITION1);
}

 }