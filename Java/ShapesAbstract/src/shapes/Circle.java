package shapes;

public class Circle extends Shape {
    private int radius;
    public Circle(int radius){
        this. radius=radius;
    }

    public void calArea(){
        System.out.println ("area of circle :" +(3.14 * radius*radius*radius));
    }
}