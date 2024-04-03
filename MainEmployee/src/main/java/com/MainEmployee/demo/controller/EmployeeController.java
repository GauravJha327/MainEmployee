package com.MainEmployee.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MainEmployee.demo.entity.Employee;
import com.MainEmployee.demo.entity.TaxDetails;
import com.MainEmployee.demo.service.EmployeeServiceInter;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInter empSerIntr;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp){
		Employee empDetails= empSerIntr.addEmployee(emp);
		return new ResponseEntity<Employee>(empDetails,HttpStatus.CREATED); 
	}
	
	@GetMapping("/getDetails/{id}")
	public ResponseEntity<TaxDetails> calculateTax(@PathVariable Long id){
		Employee empTaxDetails= empSerIntr.fetchEmployeeById(id);
		TaxDetails taxDetails=empSerIntr.calculateTax(empTaxDetails);
		
		return new ResponseEntity<TaxDetails>(taxDetails,HttpStatus.OK);
	}

}
