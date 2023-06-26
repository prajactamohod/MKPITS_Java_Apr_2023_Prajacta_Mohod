class AreaOfRectangle{
public int Rectangle(int length,int width){
return length*width;
}
public long Rectangle(long length , long width){
return length*width;
}
public static void main(String[]args){
AreaOfRectangle areaofrectangle=new AreaOfRectangle();
int rectangle =areaofrectangle.Rectangle(10 ,30);
System.out.println("Area of Rectangle="+rectangle);
long rectangle1=areaofrectangle.Rectangle(500 ,456);
System.out.println("Area Of Rectangle="+rectangle1);
}
}

