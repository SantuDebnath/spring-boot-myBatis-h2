# spring-boot-myBatis-h2-hateoas
A sample project using Spring-boot, Mybatis and H2 database

This is a simple employee management portal, where someone can execute basic CRUD operations on employee.
Each employee has a department. Using Mybatis entities are mapped in mapper. Annotations are used instead of xml.
Here, Department and Employee has one to many relationship.
This project have rest end points for add, update, delete, get by empId, getAll employee, get department with corresponding employees functionality.

# Technical Stack description

**Spring Boot** : Spring Boot is a brand new framework from the team at Pivotal, designed to simplify the bootstrapping and development of a new Spring application. The framework takes an opinionated approach to configuration, freeing developers from the need to define boilerplate configuration

**MyBatis**: MyBatis is a Java persistence framework that couples objects with stored procedures or SQL statements using an XML descriptor or annotations.
MyBatis is light weight and fast compared to Hibernate/JPA. Here you dont need to learn HQL or JPQL. You can do anything with mysql.

**H2** : H2 is a relational database management system written in Java. It can be embedded in Java applications or run in the client-server mode

**HATEOAS** : The Hypermedia Constraint (formerly known as HATEOAS) is a constraint that is used to provide direction to the user-agent.

By including links in returned representations, the server can remove the burden from the user-agent of determining what actions can be taken based on the current application state and knowing who to interact with in-order to achieve that goal.

# You can access H2 console from below link with the given credentials..

http://localhost:8080/h2/login.jsp?jsessionid=b368e6178c785028d4c15a4a9a46c7d1

Driver Class:org.h2.Driver

JDBC URL:jdbc:h2:~/test

User Name : san

Password :


## You can simlpy run this application and interact with it using Postman

                                 
| **method  	| functionality |  url	|   request body**	|  
|---	|---   |--- 	|---	|
|  GET 	| get all employees | localhost:8080/employee/getAllEmp 	| N/A  	| 
|  POST	| create a new employee  | localhost:8080/employee/createEmp	|{"name": "Srinibas", "deptCode": "DBA","passportNo": "E123876"}|   
|  POST | update an existing employee	|  localhost:8080/employee/updateEmp 	|{ "name": "Haneef_seikh", "empId": 1001,"deptCode": "ADM", "passportNo": "E1234567"}|   
|PUT|delete am employee|localhost:8080/employee/delEmp/1002|N/A|
|GET|get an emplyee by id|localhost:8080/employee/getEmp/1003|N/A|
|GET|get department by dept code|localhost:8080/employee/dept/ADM|N/A|



written using markdown syntax :-)
