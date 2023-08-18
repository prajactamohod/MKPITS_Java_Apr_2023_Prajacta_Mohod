import java.io.*;
import static java.lang.Integer.*;



public class Main {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Number:");
        try {
            String nm=br.readLine();
            System.out.println("Square :"+(Integer.parseInt(nm)*Integer.parseInt(nm) ));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Enter Name:");
        try {
            String nm=br.readLine();
            System.out.println("Hii :"+nm);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Address:");
        try {
            String nm=br.readLine();
            System.out.println("Welcome to  :"+nm);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
        }