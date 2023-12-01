package com.example.JPA_Rest.dao;

import com.example.JPA_Rest.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDaoImplementation  implements  StudentDao{

    private EntityManager entityManager;
   @Autowired
    public StudentDaoImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Student> findAll() {
        return null;
    }
}
