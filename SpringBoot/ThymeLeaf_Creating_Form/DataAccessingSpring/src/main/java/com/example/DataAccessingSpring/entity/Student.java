package com.example.DataAccessingSpring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Student {

    private String rollno;

    private String name;

    private String City;

    private String Gender;

    public Student() {
    }

    public Student(String rollno, String name, String city, String gender) {
        this.rollno = rollno;
        this.name = name;
        City = city;
        Gender = gender;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}

