package com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.domains.Employee;

@Mapper
public interface EmployeeMapper {
	
	@Insert("insert into employee(name, emp_Id, deptCode, passport_No) values (#{name}, null, #{deptCode}, #{passportNo})")
	@Options(useGeneratedKeys=true, keyProperty="empId")
	public int createEmployee(Employee emp);
	
	@Select("SELECT * FROM employee WHERE emp_Id = #{empId}")
	@Results({
		@Result(property = "empId", column = "emp_Id"),
	    @Result(property = "passportNo", column = "passport_No")})
	public Employee getEmplyee(@Param("empId") Long empId);
	
	@Select("select * from employee")
	@Results({
		@Result(property = "empId", column = "emp_Id"),
	    @Result(property = "passportNo", column = "passport_No")})
	public List<Employee> getAllEmployee();
	
	@Update("update employee set name=#{name}, emp_Id=#{empId}, deptCode=#{deptCode},passport_No=#{passportNo} where emp_Id=#{empId}")
	public int updateEmployee(Employee emp);
	
	@Delete("delete from employee where emp_Id=#{empId} ")
	public boolean deleteEmployee(@Param("empId") Long empId);
	
	@Select("SELECT * FROM employee WHERE deptCode = #{deptCode}")
	@Results({
		@Result(property = "empId", column = "emp_Id"),
	    @Result(property = "passportNo", column = "passport_No")})
	public List<Employee> getEmployeeByDeptCode(String deptCode);


}
