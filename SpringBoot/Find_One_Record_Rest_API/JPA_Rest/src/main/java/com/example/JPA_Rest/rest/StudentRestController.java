package com.example.JPA_Rest.rest;

import com.example.JPA_Rest.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.JPA_Rest.service.StudentService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")

    public List<Student> retrive(){
        return studentService.findAll();


    }

//    @GetMapping("/students/{studentsID}")
//    public Student getStudent(@PathVariable int StudentID){
//
//        List<Student> studentList=new ArrayList<>();
//
//        studentList.add(new Student(1001,"Prajacta", "Amravati" ,"MIDC"));
//        studentList.add(new Student(1002,"Prince","Amravati","MIDC"));
//        return studentList.get(StudentID);
//
//    }
}
