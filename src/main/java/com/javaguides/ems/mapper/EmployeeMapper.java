package com.javaguides.ems.mapper;

import com.javaguides.ems.dto.EmployeeDto;
import com.javaguides.ems.entity.Employee;

public class EmployeeMapper {

	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		
		return new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail()
		);
	}
	
	public static Employee mapToEmployee(EmployeeDto  employeeDto) {
		
		return new Employee(
				employeeDto .getId(),
				employeeDto.getFirstName(),   
				employeeDto.getLastName(),
				employeeDto.getEmail()
		);
	}
}
