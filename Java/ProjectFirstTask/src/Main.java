import stud.*;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s=new Student("Prajacta","90");
        ReadWrite.writeObjectToFile(s);
        ReadWrite.readObjectFromFile();
    }
}
