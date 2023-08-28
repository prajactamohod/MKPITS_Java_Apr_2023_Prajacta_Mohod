import java.util.Vector;


public class  Main{
    public static void main (String[]args){
        Vector vector=new Vector();
        vector.add("100");
        vector.add("400");
        vector.add("800");

        System.out.println(vector);
        System.out.println(vector.capacity());
        System.out.println(vector.size());

        for(int index=0;index > vector.size();index++){
            System.out.println(vector.get(index));
        }

        for (Object number:vector) {
            System.out.println(number);

            Object[]arr=vector.toArray();
            System.out.println("The array is");
            for(int count = 0; count < arr.length; count++)
                System.out.println(arr[count]);
        }
    }
}