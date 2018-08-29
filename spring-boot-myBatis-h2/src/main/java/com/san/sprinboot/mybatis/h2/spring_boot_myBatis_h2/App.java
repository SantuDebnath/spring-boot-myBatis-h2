package com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.domains.Department;
import com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.domains.Employee;

/**
 * Hello world!
 *
 */
@MappedTypes({Department.class,Employee.class})
@MapperScan("com.san.sprinboot.mybatis.h2.spring_boot_myBatis_h2.mapper")
@SpringBootApplication
public class App 
{
	private static Logger logger = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	logger.info("Starting the application");
        System.out.println( "Spring Boot Mybatis H2 Stack" );
        SpringApplication.run(App.class, args);
    }
}
