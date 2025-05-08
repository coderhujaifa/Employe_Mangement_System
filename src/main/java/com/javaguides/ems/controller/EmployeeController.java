package com.javaguides.ems.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaguides.ems.dto.EmployeeDto;
import com.javaguides.ems.service.EmployeeService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService; 
	
	 public EmployeeController(EmployeeService employeeService) {
	        this.employeeService = employeeService;
	    }
	
		
//		Build Add Employee REST API	
		@PostMapping
		public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
			EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
			return new ResponseEntity<>(savedEmployee,HttpStatus.CREATED);
		}
		
//		Build Get Employee REST API
		@GetMapping("{id}")
		public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
			EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
			return ResponseEntity.ok(employeeDto);  
	}
		
//		Build Get All Employee REST API
		@GetMapping
		public ResponseEntity<List<EmployeeDto>> getAllEmployee(){
			List<EmployeeDto> employees = employeeService.getAllEmployee();
			return ResponseEntity.ok(employees);  
	}
		
		
//		Build Update Employee REST API
		@PutMapping("{id}")
		public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,
															@RequestBody EmployeeDto updatedEmployee){
			EmployeeDto employeeDto = employeeService.updateEmployee(employeeId,updatedEmployee);
			return ResponseEntity.ok(employeeDto);  
	}
		
		
//		Build Delete Employee REST API
		@DeleteMapping("{id}")
		public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId) {
			employeeService.deleteEmployee(employeeId);
			return ResponseEntity.ok("Employee delete successfully");
		}
		
}


