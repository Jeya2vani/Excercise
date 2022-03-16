package com.example.springmongodb.service;

import com.example.springmongodb.dto.EmployeeResponse;
import com.example.springmongodb.model.Employee;
import com.example.springmongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

@Component
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<EmployeeResponse> getAllEmployee(){
        List<Employee> employees=employeeRepository.findAll();
        float minSalary = getMinimumSalary(employees).floatValue();
        employees = employees.stream()
                .map((x -> {
                    x.setSalaryPercentage(x.getSalary()*100/minSalary);
                    return x;
                }))
                .collect(Collectors.toList());
        return employees.stream()
                .map(this::getEmployees)
                .collect(Collectors.toList());
    }
    public EmployeeResponse getEmployees(Employee employee)
    {
        EmployeeResponse employeeResponse=new EmployeeResponse();
        employeeResponse.setName(employee.getName());
        employeeResponse.setSalary(employee.getSalary());
        employeeResponse.setSalaryPercentage(employee.getSalaryPercentage());
        return employeeResponse;
    }
    private Float getMinimumSalary(List<Employee> employees)
    {
        Employee employee = employees.stream()
                .min((x,y) -> Float.compare(x.getSalary(), y.getSalary()))
                .get();
        return employee.getSalary();
    }
}
