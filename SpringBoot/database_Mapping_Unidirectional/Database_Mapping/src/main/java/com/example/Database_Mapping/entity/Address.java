package com.example.Database_Mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student_address")

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String address;
    private String city;

    public Address() {
    }

    public Address(String address, String city) {
        this.address = address;
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

