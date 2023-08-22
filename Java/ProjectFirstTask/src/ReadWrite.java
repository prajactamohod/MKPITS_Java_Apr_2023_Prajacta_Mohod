

import stud.*;

import java.io.*;

public class ReadWrite {
    public static void writeObjectToFile(Student s) throws IOException, IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        oos.writeObject(s);
        oos.close();
    }
    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.txt"));
        Student s = (Student) (ois.readObject());
        System.out.println(s.getName()+" "+s.getMarks());
    }
}
