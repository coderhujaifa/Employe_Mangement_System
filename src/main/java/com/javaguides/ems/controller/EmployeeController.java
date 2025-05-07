package com.javaguides.ems.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaguides.ems.dto.EmployeeDto;
import com.javaguides.ems.entity.Employee;
import com.javaguides.ems.service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	private EmployeeService employeeService; 
		
//		Build Add Employee REST API
		@PostMapping
		public ResponseEntity<EmployeeDto> creatEmployee(@RequestBody Employee employeeDto){
			EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
			return new ResponseEntity<>(savedEmployee,HttpStatus.CREATED);
		}
		
//		Build Get Employee REST API
		@PostMapping("{id}")
		public ResponseEntity<EmployeeDto> creatEmployee(@PathVariable("id") Long employee){
			EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
			return ResponseEntity.ok(employeeDto);  
	}
}


