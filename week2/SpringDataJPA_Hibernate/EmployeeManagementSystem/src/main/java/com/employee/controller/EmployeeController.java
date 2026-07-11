package com.employee.controller;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Sort;
import com.employee.projection.EmployeeProjection;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id,
                                   @RequestBody Employee employee) {
        employee.setId(id);
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
    }
    @GetMapping("/page")
    public Page<Employee> getEmployeesByPage(
            @RequestParam int page,
            @RequestParam int size) {

        Pageable pageable = PageRequest.of(page, size);
        return service.getEmployees(pageable);
    }
    @GetMapping("/sort")
    public List<Employee> sortEmployees(
            @RequestParam String field) {

        return service.getEmployeesSorted(field);
    }
    @GetMapping("/page-sort")
    public Page<Employee> getEmployeesPageAndSort(
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String field) {

        Pageable pageable = PageRequest.of(
                page,
                size,
                Sort.by(Sort.Direction.ASC, field)
        );

        return service.getEmployees(pageable);
    }
    @GetMapping("/projection")
    public List<EmployeeProjection> getProjectedEmployees() {
        return service.getProjectedEmployees();
    }
    @GetMapping("/email")
    public Employee getEmployeeByEmail(
            @RequestParam String email) {

        return service.getEmployeeByEmail(email);
    }
    @GetMapping("/search")
    public List<Employee> searchEmployee(
            @RequestParam String name) {

        return service.searchEmployee(name);
    }
    @GetMapping("/native")
    public List<Employee> getEmployeesNative() {
        return service.getEmployeesNative();
    }
}