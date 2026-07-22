package com.cognizant.springlearn.dao;

import com.cognizant.springlearn.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {

    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "John", 50000));
        employees.add(new Employee(2, "Alice", 60000));
        employees.add(new Employee(3, "Bob", 55000));

        return employees;
    }
}