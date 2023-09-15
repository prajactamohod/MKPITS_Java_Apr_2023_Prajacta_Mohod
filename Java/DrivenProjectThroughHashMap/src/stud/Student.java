package stud;

public class Student implements Comparable<Student> {
    private String name;
    private int marks;
    public Student(String payal, int i){

    }

    public Student(String name, String marks){
        this.name=name;
        this.marks= Integer.parseInt(marks);
    }
    public String getName(){
        return name;
    }

    public int getMarks() {
        return marks;
    }
    @Override
    public int compareTo(Student o) {
        if (marks == o.marks)
            return 0;
        else if (marks < o.marks)
            return -1;
        else
            return 1;
    }
    }