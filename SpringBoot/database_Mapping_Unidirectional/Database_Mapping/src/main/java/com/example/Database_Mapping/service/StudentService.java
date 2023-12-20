package com.example.Database_Mapping.service;

import com.example.Database_Mapping.entity.Student;

import java.util.List;

public interface StudentService {
    String save(Student student);
    Student find (Integer rollno);
    List<Student> findallStudent(Student student);
    void delete (Integer rollno);

   Student Update (Student student);


}

