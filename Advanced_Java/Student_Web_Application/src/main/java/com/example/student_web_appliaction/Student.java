package com.example.student_web_appliaction;

public class Student {

   private String Roll_no;

   private String Name;
   private String Address;
   private String City;

    public Student() {


    }

    public Student(String roll_no, String name, String address, String city) {
        Roll_no = roll_no;
        Name = name;
        Address = address;
        City = city;
    }

    public String getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(String roll_no) {
        Roll_no = roll_no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
