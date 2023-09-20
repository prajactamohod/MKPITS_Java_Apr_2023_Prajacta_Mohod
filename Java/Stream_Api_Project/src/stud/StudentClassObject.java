package stud;

import java.util.*;
import java.util.stream.Collectors;

public class StudentClassObject {
    private static Object ArrayList;

    public static void main(String[] args) {
        ArrayList<Student> arrayList=new <Student>ArrayList();
        Student[] students=new Student[6];
        students[0]=new Student("Avinash",99);
        students[1]=new Student("Rudhra",96);
        students[2]=new Student("Ananya",93);
        students[3]=new Student("Ankush",94);
        students[4]=new Student("Gargi",89);
        students[5]=new Student("Anirudhra",70);

        arrayList.addAll(Arrays.asList(students));
        System.out.println(arrayList);

        List<Student> list=  Arrays.stream(students).map(c->c).collect(Collectors.toList());
        System.out.println(list);



    }
}