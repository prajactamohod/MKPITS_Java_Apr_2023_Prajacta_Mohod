package com.example.Database_Mapping.service;

import com.example.Database_Mapping.entity.Student;
import com.example.Database_Mapping.repo.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;

    @Autowired

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    @Transactional
    public String save(Student student){
        studentRepository.save(student);
        return "Data inserted";
    }

    @Override
    public Student find(Integer rollno){
        return studentRepository.findById(rollno).get();
    }

    @Override
    public List<Student> findallStudent(Student student) {
    return  studentRepository.findAll();

    }
    @Override
    public Student Update(Student student) {
        Optional<Student> optionalStudent=studentRepository.findById(student.getRollno());
        if (optionalStudent.isPresent()) {
            studentRepository.save(student);
        } else{
            System.out.println("Data Not Fetched");
        }

        return student;
    }


    @Override
    public void delete(Integer rollno) {
         studentRepository.deleteById(rollno);
    }



}

