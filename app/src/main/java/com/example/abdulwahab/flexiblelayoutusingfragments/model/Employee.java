package com.example.abdulwahab.flexiblelayoutusingfragments.model;


import java.io.Serializable;

public class Employee implements Serializable {
    public final int id;
    public final String name;
    public final String details;

    public Employee(int id, String name, String details) {
        this.id = id;
        this.name = name;
        this.details = details;
    }


    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}

