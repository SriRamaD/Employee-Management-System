package com.example.ems_backend.repository;

import com.example.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//EmployeeRepository will get to perform CRUD operations on the Employee Entity
public interface EmployeeRepository extends JpaRepository<Employee, Long >  {
}
