package com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.domains.Employee;
import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.repository.EmployeeDao;

@Service
public class EmpoyeeServiceImpl implements EmpoyeeService   {

	private static Logger logger = LoggerFactory.getLogger(EmpoyeeServiceImpl.class); 
	
	@Autowired
	EmployeeDao empDao;
	
	@Override
	public Employee createEmployee(Employee emp) {
		return empDao.createEmployee(emp);
	}

	@Override
	public Employee getEmplyee(Long empId) {
		return empDao.getEmplyee(empId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return empDao.getAllEmployee();
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return empDao.updateEmployee(emp);
	}

	@Override
	public boolean deleteEmployee(Long empId) {
		return empDao.deleteEmployee(empId);
	}

}
