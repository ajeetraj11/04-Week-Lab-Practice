package com.serializationsaveandretrieveanobject;

import java.io.*;

// Class representing an Employee, implementing Serializable for object serialization
public class Employee implements Serializable {

    // Unique identifier for ensuring class compatibility during deserialization
    private static final long serialVersionUID = 1L;

    // Employee ID
    private int id;

    // Employee Name
    private String name;

    // Employee Department
    private String department;

    // Employee Salary
    private double salary;

    // Constructor to initialize Employee object with given values
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("------------------------------");
    }
}
