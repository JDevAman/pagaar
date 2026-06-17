package com.devaman.pagaar.employee;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{employeeCode}")
    public Employee getEmployee(@PathVariable String employeeCode) {
        return employeeService.getEmployeeByCode(employeeCode);
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

//    @PostMapping("/add")
//    public void addEmployee(@PathVariable String employeeCode) {
//        return;
//    }
}
