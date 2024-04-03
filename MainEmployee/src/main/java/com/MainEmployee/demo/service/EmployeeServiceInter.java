package com.MainEmployee.demo.service;

import com.MainEmployee.demo.entity.Employee;
import com.MainEmployee.demo.entity.TaxDetails;

public interface EmployeeServiceInter {

	Employee addEmployee(Employee emp);

	Employee fetchEmployeeById(Long id);

	TaxDetails calculateTax(Employee empTaxDetails);

}
