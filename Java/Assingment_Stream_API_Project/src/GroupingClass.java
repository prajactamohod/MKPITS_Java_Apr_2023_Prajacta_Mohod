import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;


public class GroupingClass {
    public static void main(String[] args) {

        List<String> String = Arrays.asList("Apple", "Coconut", "Bluebrrey", "Banana", "Date", "Milan", "Italy", "India");
        Map<Integer, Long> map = string.stream().colect(Collectors.groupingBy(String::length), Collectors.counting());
//        System.out.println(map);
        map.forEach((key, value) -> System.out.println("String of lengh" + key + " are" + value));


//          Student []student=new Student[5];
//          student[0]=new Student(name:"Priya",marks:89);
//          student[0]=new Student(name:"Priya",marks:89);
//          student[0]=new Student(name:"Priya",marks:89);
//          student[0]=new Student(name:"Priya",marks:89);
//          student[0]=new Student(name:"Priya",marks:89);

//        List<Student> students = Arrays.asList(student);
//        Student studMin = students.stream().min(Camparator.comparingInt(Student::getMarks)).get();
//        System.out.println("Lowest " + studMin.getName() + " Marks :" + studMin.getMarks());
//        Student studMax = students.stream().max(Camparator.camparingInt(Student::getmarks)).get();
//        System.out.println("Topper" + studMax.getName() + "  Marks :  " + studMax.getMarks());
//    }
//}
//
//


    }
}


