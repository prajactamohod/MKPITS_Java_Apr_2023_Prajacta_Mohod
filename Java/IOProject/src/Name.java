import java.io.*;
public class Name {
    public static void main(String[]args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name:");
        try {
            String nm=br.readLine();
             System.out.println("Welcome :"+nm);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

