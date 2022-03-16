package com.example.springmongodb.repository;

import com.example.springmongodb.dto.EmployeeResponse;
import com.example.springmongodb.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository("employeeRepository")
public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
}

