package com.example.JPA_Rest.dao;

import com.example.JPA_Rest.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();


}
