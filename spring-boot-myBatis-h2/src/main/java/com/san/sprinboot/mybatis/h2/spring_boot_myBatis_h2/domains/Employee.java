package com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.domains;

public class Employee {

	private String name;
	
	private Long empId;
	
	private String deptCode;
	
	private String passportNo;

	
	
	public Employee() {
		super();
	}

	public Employee(String name, Long empId, String deptCode, String passportNo) {
		super();
		this.name = name;
		this.empId = empId;
		this.deptCode = deptCode;
		this.passportNo = passportNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + empId + ", deptCode=" + deptCode + ", passportNo=" + passportNo + "]";
	}
	
	
	
}
