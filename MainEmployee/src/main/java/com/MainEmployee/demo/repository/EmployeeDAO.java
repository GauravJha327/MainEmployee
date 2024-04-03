package com.MainEmployee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MainEmployee.demo.entity.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long>{

}
