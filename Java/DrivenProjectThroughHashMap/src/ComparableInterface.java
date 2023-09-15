import stud.Student;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
public class ComparableInterface {
    public static void main(String [] args){
        LinkedList<Student>Linkedlist=new LinkedList<Student>();
        Student [] students=new Student[4];
        students[0]=new Student("Prajacta","89");
        students[1]=new Student("Riya","78");
        students[2]=new Student("Pooja","98");
        students[3]=new Student("Tiya","56");
        Linkedlist.addAll(Arrays.asList(students));
        Collections.sort(Linkedlist);
        for(Student student:Linkedlist){
            System.out.println(student.getName()+" "+student.getMarks());
        }


    }
}
