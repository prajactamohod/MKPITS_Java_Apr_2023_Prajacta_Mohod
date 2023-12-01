package com.example.JPA_Rest.service;

import com.example.JPA_Rest.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
}
