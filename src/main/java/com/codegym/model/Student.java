package com.codegym.model;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name;
    private LocalDate birth;
    private String address;
    private String phone;
    private String email;
    private int class_id;

    public Student() {
    }

    public Student(int id, String name, LocalDate birth, String address, String phone, String email, int class_id) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.class_id = class_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public Student(String name, LocalDate birth, String address, String phone, String email, int class_id) {
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.class_id = class_id;


    }
}
