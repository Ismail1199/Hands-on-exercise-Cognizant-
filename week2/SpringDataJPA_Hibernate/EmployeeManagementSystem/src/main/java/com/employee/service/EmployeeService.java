package com.employee.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import com.employee.projection.EmployeeProjection;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return repository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return repository.save(employee);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
    public Page<Employee> getEmployees(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public List<Employee> getEmployeesSorted(String field) {
        return repository.findAll(Sort.by(Sort.Direction.ASC, field));
    }
    public List<EmployeeProjection> getProjectedEmployees() {
        return repository.findAllProjectedBy();
    }
    public Employee getEmployeeByEmail(String email) {
        return repository.findEmployeeByEmail(email);
    }

    public List<Employee> searchEmployee(String name) {
        return repository.searchEmployee(name);
    }

    public List<Employee> getEmployeesNative() {
        return repository.getAllEmployeesNative();
    }
}