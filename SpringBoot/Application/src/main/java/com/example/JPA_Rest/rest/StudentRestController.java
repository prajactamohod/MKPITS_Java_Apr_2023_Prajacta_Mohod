package com.example.JPA_Rest.rest;

import com.example.JPA_Rest.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;

@RestController
//@RequestMapping("/api")

public class StudentRestController {
    @GetMapping("/students")

    public List<Student> getStudent(){

        List<Student> studentList=new ArrayList<>();

        studentList.add(new Student(1001,"Prajacta", "Amravati" ,"MIDC"));
        studentList.add(new Student(1002,"Prince","Amravati","MIDC"));
        return studentList;
    }

//    @GetMapping("/students/{studentsID}")
//    public students getStudent(@PathVariable int StudentID){
//
//        students.add(new students(1001,"Prajacta","Amravati"));
//        students.add(new students(1002,"Prince","Amravati"));
//
//
//        return students();
//    }
}
