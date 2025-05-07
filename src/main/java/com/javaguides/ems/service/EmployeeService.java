package com.javaguides.ems.service;

import java.util.List;

import com.javaguides.ems.dto.EmployeeDto;


public interface EmployeeService {

	EmployeeDto createEmployee(EmployeeDto employeeDto);
	
	EmployeeDto getEmployeeById(Long employee);
	
	List<EmployeeDto> getAllEmployee();
}
