package com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.App;
import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.domains.Employee;
import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.mapper.EmployeeMapper;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	private static Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);
	
	@Autowired
	EmployeeMapper empeMapper;
	
	@Override
	public Employee createEmployee(Employee emp) {
		int newEmpId = empeMapper.createEmployee(emp);
		return getEmplyee(emp.getEmpId());
	}

	@Override
	public Employee getEmplyee(Long empId) {
		return empeMapper.getEmplyee(empId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return empeMapper.getAllEmployee();
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		empeMapper.updateEmployee(emp);
		return getEmplyee(emp.getEmpId());
	}

	@Override
	public boolean deleteEmployee(Long empId) {
		return empeMapper.deleteEmployee(empId);
	}

}
