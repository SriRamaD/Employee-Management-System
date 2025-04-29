package com.example.ems_backend.controller;

import com.example.ems_backend.dto.EmployeeDto;
import com.example.ems_backend.entity.Employee;
import com.example.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;
    //Building ADD EMPLOYEE Rest API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto newSavedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(newSavedEmployee, HttpStatus.CREATED);
    }
    //Building GET EMPLOYEE Rest API
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeByID(@PathVariable("id") Long employeeId) {
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }
    //Building GET ALL EMPLOYEES Rest API
    @GetMapping
    public  ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }
    //Building Update Employee REST API
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto>  updateEmployee(@PathVariable("id") Long employeeId, @RequestBody EmployeeDto updatedEmployee){
        EmployeeDto employeeDto = employeeService.updateEmployee(employeeId, updatedEmployee);
        return ResponseEntity.ok(employeeDto);
    }
    //Building DELETE Employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("Employee delete successfully");
    }
}
