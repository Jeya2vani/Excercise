package com.example.springmongodb.resource;

import com.example.springmongodb.dto.EmployeeResponse;
import com.example.springmongodb.model.Employee;
import com.example.springmongodb.repository.EmployeeRepository;
import com.example.springmongodb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Emplo")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/findAllEmployee")
    public List<EmployeeResponse> getEmployee()
    {
        return employeeService.getAllEmployee();
    }
}
