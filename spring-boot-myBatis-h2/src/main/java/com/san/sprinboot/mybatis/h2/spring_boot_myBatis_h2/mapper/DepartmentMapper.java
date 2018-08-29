package com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

import org.apache.ibatis.annotations.Many;

import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.domains.Department;
import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.domains.Employee;

@Mapper
public interface DepartmentMapper {

	@Select("SELECT * FROM department WHERE deptCode = #{deptCode}") 
	  @Results(value = {@Result(property = "deptCode", column = "deptCode"), 
		  		@Result(property = "deptName", column = "deptNAme"),
	            @Result(property = "employees", javaType = List.class, column = "deptCode",
	              many = @Many(select = "getEmployeeByDeptCode"))}) 
	public  Department getDepartmentByDeptCode(@Param("deptCode") String deptCode);
	
@Select("SELECT * FROM employee WHERE deptCode = #{deptCode}")
@Results({
@Result(property = "empId", column = "emp_Id"),
@Result(property = "passportNo", column = "passport_No")})
public List<Employee> getEmployeeByDeptCode(String deptCode);

	@Select("SELECT * FROM department WHERE deptCode = #{deptCode}") 
	public  Department getDepartmentByCode(@Param("deptCode") String deptCode);

}
