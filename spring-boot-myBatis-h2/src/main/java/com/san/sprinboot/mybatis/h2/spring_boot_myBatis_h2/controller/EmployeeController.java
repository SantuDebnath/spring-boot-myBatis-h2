package com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.domains.Department;
import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.domains.Employee;
import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.mapper.DepartmentMapper;
import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.mapper.EmployeeMapper;
import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.service.EmpoyeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	private static Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmpoyeeService empService;
	
	@Autowired
	DepartmentMapper deptMapper;
	
	@Autowired
	EmployeeMapper empMapper;
	
	@RequestMapping(value="/createEmp", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee emp){
		
		return empService.createEmployee(emp);
	}
	
	
	@RequestMapping(value="/getEmp/{empId}",method = RequestMethod.GET)
	public Employee getEmplyee(@PathVariable Long empId){
		logger.info("calling employee service");
		return empService.getEmplyee(empId);
	}
	
	@GetMapping(value="/getAllEmp", produces=MediaTypes.HAL_JSON_VALUE)
	public List<Employee> getAllEmployee(){
		List<Employee> empsWithLinks= new ArrayList<>();
		List<Employee> employees = empService.getAllEmployee();
		if(!CollectionUtils.isEmpty(employees) ){
			for(Employee emp : employees){
				
				Link getEmplink = ControllerLinkBuilder.linkTo(EmployeeController.class).slash("getEmp").slash(emp.getEmpId()).withSelfRel();
				Link delEmplink = ControllerLinkBuilder.linkTo(EmployeeController.class).slash("delEmp")
						.slash(emp.getEmpId()).withRel("delete employee").withMedia("PUT").withTitle("delete employee");
				
				emp.add(getEmplink);
				emp.add(delEmplink);
				empsWithLinks.add(emp);
			}
		}
		return empsWithLinks;
	}
	
	@RequestMapping(value="/updateEmp",method = RequestMethod.POST)
	public Employee updateEmployee(@RequestBody Employee emp){
		
		return empService.updateEmployee(emp);
	}
	
	@RequestMapping(value="/delEmp/{empId}", method = RequestMethod.PUT )
	public boolean deleteEmployee(@PathVariable Long empId){
		
		return empService.deleteEmployee(empId);
	}
	
	@GetMapping("/dept/{deptCode}")
	public Department getDepartmentByCode(@PathVariable String deptCode){
		Department dept = deptMapper.getDepartmentByDeptCode(deptCode);
		 return dept;
	}
	
	
	@GetMapping("/{deptCode}")
	public List<Employee> getEmployeeByDeptCode(@PathVariable String deptCode){
		return empMapper.getEmployeeByDeptCode(deptCode);
	}

}
