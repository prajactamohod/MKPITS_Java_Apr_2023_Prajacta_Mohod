interface shape{
    void calArea(int l,int b);

}
public class LambdaExpressionMainFile {
    public static void main(String []args){
       shape s=(l,b)-> System.out.printf("Area of Rectangle =" +(l*b));
       s.calArea(67,89);
    }
}