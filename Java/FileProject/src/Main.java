
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f=new File("D:","MyProject");
        System.out.println(f.exists());
        System.out.println(f.getParentFile());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.lastModified());
        System.out.println(f.getPath());
        File f2=new File("D:\\");
        System.out.println(f2.exists());
        System.out.println(f2.lastModified());
        System.out.println(f2.getFreeSpace());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.isDirectory());
        System.out.println(f2.canExecute());
        System.out.println(f2.setReadable(true));
        File f3=new File(f2,"MyProject");
        String[] files= f2.list();
        for(String fn:files) {
            System.out.println(fn);

        }

    }


}


