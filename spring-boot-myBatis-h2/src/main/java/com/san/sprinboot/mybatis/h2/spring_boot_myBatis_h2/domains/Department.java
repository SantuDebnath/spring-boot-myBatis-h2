package com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.domains;

import java.util.List;

public class Department {

	private String deptCode;
	
	private String deptName;
	
	private List<Employee> employees;

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [deptCode=" + deptCode + ", deptNAme=" + deptName + ", employees=" + employees + "]";
	}

	
	
}
