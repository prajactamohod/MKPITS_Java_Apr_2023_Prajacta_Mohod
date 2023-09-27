import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Course {
    private String courseName;
    private int credits;
    private double grade;

    public Course(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
        this.grade = 0.0;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

class Student {
    private String studentName;
    private List<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public double calculateGPA() {
        double totalCredits = 0.0;
        double totalWeightedGPA = 0.0;

        for (Course course : courses) {
            totalCredits += course.getCredits();
            totalWeightedGPA += course.getGrade() * course.getCredits();
        }

        if (totalCredits == 0) return 0.0;

        return totalWeightedGPA / totalCredits;
    }
}

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        Student student = new Student(studentName);

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course name for course " + (i + 1) + ": ");
            String courseName = scanner.nextLine();

            System.out.print("Enter credits for course " + (i + 1) + ": ");
            int credits = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter grade (0.0 - 4.0) for course " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            scanner.nextLine();

            Course course = new Course(courseName, credits);
            course.setGrade(grade);

            student.addCourse(course);
        }

        // Calculate GPA
        double gpa = student.calculateGPA();
        System.out.println("Student GPA: " + gpa);
    }
}

