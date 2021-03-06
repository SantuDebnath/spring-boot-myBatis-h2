package com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.service;

import java.util.List;

import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.domains.Employee;

public interface EmpoyeeService {

	public Employee createEmployee( Employee emp);
	
	public Employee getEmplyee(Long empId);
	
	public List<Employee> getAllEmployee();
	
	public Employee updateEmployee(Employee emp);
	
	public boolean deleteEmployee(Long empId);
}
