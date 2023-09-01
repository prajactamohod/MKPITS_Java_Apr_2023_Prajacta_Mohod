import java.io.*;

public class FromOneFolderToAnother {
    public static void displayFileData(String str1,String str2) throws FileNotFoundException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader(str1));
        try {
           String sourceFile= bufferedReader.readLine();
           File file=new File (sourceFile);


            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(str2));
            bufferedWriter.write(sourceFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
