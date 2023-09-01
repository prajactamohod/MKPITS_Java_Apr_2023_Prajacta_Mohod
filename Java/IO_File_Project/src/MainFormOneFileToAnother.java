import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainFormOneFileToAnother {
    public static void main(String[] args){
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter source file: ");
        try {
            String sourceFile= bufferedReader.readLine();
            File file=new File(sourceFile);
            if (!file.exists()) {
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FromOneFolderToAnother.displayFileData();
    }

}
