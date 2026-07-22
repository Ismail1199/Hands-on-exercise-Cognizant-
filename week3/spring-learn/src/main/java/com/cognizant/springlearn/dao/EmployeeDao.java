package com.cognizant.springlearn.dao;

import com.cognizant.springlearn.model.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {

    private static final List<Employee> EMPLOYEE_LIST;

    static {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        EMPLOYEE_LIST = context.getBean("employeeList", List.class);

        context.close();
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }

    public Employee getEmployee(int id) {

        for (Employee employee : EMPLOYEE_LIST) {
            if (employee.getId() == id) {
                return employee;
            }
        }

        return null;
    }
}