package com.employee.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.employee.model.Employee;

public interface EmployeeService {

	
	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);
	
	// pagination
	Page<Employee> findPaginated(int pageNo, int pageSize);
}
