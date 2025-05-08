package com.javaguides.ems.service;

import java.util.List;
import com.javaguides.ems.dto.EmployeeDto;
import com.javaguides.ems.entity.Employee;


public interface EmployeeService {

	EmployeeDto createEmployee(EmployeeDto employeeDto);
	
	EmployeeDto getEmployeeById(Long employeeId);

	List<EmployeeDto> getAllEmployee();
	
	EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee);
	
	void deleteEmployee(Long employeeId);
}
