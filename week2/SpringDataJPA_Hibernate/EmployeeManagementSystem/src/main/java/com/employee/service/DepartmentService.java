package com.employee.service;

import com.employee.entity.Department;
import com.employee.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public List<Department> getAllDepartments() {
        return repository.findAll();
    }

    public Optional<Department> getDepartmentById(Long id) {
        return repository.findById(id);
    }

    public Department saveDepartment(Department department) {
        return repository.save(department);
    }

    public Department updateDepartment(Department department) {
        return repository.save(department);
    }

    public void deleteDepartment(Long id) {
        repository.deleteById(id);
    }
}