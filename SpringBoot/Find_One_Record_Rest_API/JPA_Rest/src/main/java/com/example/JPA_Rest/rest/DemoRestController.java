package com.example.JPA_Rest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")



public class DemoRestController {
    @GetMapping("/Hello")
    public String sayHello(){
        return "Hello";

    }

}
