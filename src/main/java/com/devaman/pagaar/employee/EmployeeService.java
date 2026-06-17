package com.devaman.pagaar.employee;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee getEmployeeByCode(String employeeCode) {
        return employeeRepository.findByEmployeeCode(employeeCode).orElseThrow(() -> new RuntimeException("Employee Not found"));
    }

    public Employee addEmployee(Employee employee){
        employee.setCreatedAt(LocalDateTime.now());
        employee.setUpdatedAt(LocalDateTime.now());
        return employeeRepository.save(employee);
    }
}
