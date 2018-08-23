package com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.App;
import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.domains.Employee;
import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.service.EmpoyeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	private static Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmpoyeeService empService;
	
	@RequestMapping(value="/createEmp", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee emp){
		
		return empService.createEmployee(emp);
	}
	
	
	@RequestMapping(value="/getEmp/{empId}",method = RequestMethod.GET)
	public Employee getEmplyee(@PathVariable Long empId){
		
		return empService.getEmplyee(empId);
	}
	
	@RequestMapping(value="/getAllEmp", method = RequestMethod.GET)
	public List<Employee> getAllEmployee(){
		return empService.getAllEmployee();
	}
	
	@RequestMapping(value="/updateEmp",method = RequestMethod.POST)
	public Employee updateEmployee(@RequestBody Employee emp){
		
		return empService.updateEmployee(emp);
	}
	
	@RequestMapping(value="/delEmp/{empId}", method = RequestMethod.PUT )
	public boolean deleteEmployee(@PathVariable Long empId){
		
		return empService.deleteEmployee(empId);
	}

}
