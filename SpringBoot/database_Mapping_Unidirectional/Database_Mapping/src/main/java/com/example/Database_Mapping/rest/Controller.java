package com.example.Database_Mapping.rest;
import com.example.Database_Mapping.entity.Student;
import com.example.Database_Mapping.service.AddressService;
import com.example.Database_Mapping.service.StudentService;
import jdk.jfr.Category;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    private AddressService addressService;
    private StudentService studentService;
    public Controller(AddressService addressService,StudentService studentService) {
        this.addressService = addressService;
        this.studentService=studentService;
    }
    @PostMapping("/insert")
    public void save(@RequestBody Student student){
        studentService.save(student);
    }


    @GetMapping("/find/{id}")
    public void findById(@PathVariable int id){
        addressService.find(id);
    }


    @GetMapping("/findAll")
    public List<Student> findAll(Student student){
      return studentService.findallStudent(student);
    }

@DeleteMapping("/delete/{rollno}")
    public void delete(@PathVariable int rollno){
        studentService.delete(rollno);
}

@GetMapping("/Update")
    public Student Update(@RequestBody Student student){
        return studentService.Update(student);
}

}
