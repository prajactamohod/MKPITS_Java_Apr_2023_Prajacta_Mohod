package com.example.Database_Mapping.repo;

import com.example.Database_Mapping.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{



}
