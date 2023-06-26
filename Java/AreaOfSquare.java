class AreaOfSquare{
public int Square(int side){
return side*side;
}
public long Square(long side){
return side*side;
}
public static void main(String[]args){
AreaOfSquare areaofsquare=new AreaOfSquare();
int square =areaofsquare.Square(10);
System.out.println("Area of Square="+square);
long square1=areaofsquare.Square(500);
System.out.println("Area Of Square="+square1);
}
}

