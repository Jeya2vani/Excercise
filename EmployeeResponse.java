package com.example.springmongodb.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class EmployeeResponse {
    private String name;
    private float salary;
    private float salaryPercentage;
}
