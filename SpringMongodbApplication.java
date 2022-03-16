package com.example.springmongodb;

import com.example.springmongodb.model.Employee;
import com.example.springmongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;

@EnableMongoRepositories(basePackages ={"com.example.springmongodb.repository"} )
@SpringBootApplication
public class SpringMongodbApplication{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringMongodbApplication.class, args);
	}
}
