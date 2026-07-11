package com.employee.repository;

import com.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived Query Methods
    List<Employee> findByName(String name);

    Employee findByEmail(String email);

    List<Employee> findByNameContaining(String keyword);
    @Query(name = "Employee.findByEmployeeName")
    List<Employee> findEmployeeByName(String name);
    // JPQL Query
    @Query("SELECT e FROM Employee e WHERE e.email = ?1")
    Employee getEmployeeByEmail(String email);
}