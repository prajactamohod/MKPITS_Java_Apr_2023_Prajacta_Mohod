import java.io.*;

public class File {
    public File(String fileName1) {
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("abc.txt"));
            System.out.println("Enter Names :");
            String nm = bufferedReader.readLine();
            while (true) {
                if (nm.equals("end"))
                    break;
                bufferedWriter.write(nm + "\n");
                nm = bufferedReader.readLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {

        }
    }


}
