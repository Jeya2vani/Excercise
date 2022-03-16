package com.example.springmongodb.model;

import com.example.springmongodb.service.EmployeeService;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString
@Document(collection = "Employee")
public class Employee {
    @Autowired
    private EmployeeService employeeService;

    @Id
    private int id;
    private String name;
    private String department;
    private float salary;
    private float salaryPercentage;

}
