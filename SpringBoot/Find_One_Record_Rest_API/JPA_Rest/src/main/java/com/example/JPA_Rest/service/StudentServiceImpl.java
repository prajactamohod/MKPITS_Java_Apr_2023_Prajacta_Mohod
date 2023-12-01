package com.example.JPA_Rest.service;

import com.example.JPA_Rest.dao.StudentDaoImplementation;
import com.example.JPA_Rest.entity.Student;
import com.example.JPA_Rest.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentDaoImplementation studentDaoImplementation;


    public StudentServiceImpl(StudentDaoImplementation studentDaoImplementation) {
        this.studentDaoImplementation = studentDaoImplementation;
    }

    @Override
    public List<Student> findAll() {
        return studentDaoImplementation.findAll();
    }
}
