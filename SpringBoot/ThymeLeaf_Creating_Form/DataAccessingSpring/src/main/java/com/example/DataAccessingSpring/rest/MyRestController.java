package com.example.DataAccessingSpring.rest;

import com.example.DataAccessingSpring.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class MyRestController {
    @GetMapping("/ShowForm")
    public String formData(Model model){
        Student student=new Student();
        model.addAttribute("stud",student);
        return "ShowForm";

    }

    @PostMapping("/processstudform")
    public String processData(@ModelAttribute("stud")Student student){
        return "DisplayPage";

    }



}


