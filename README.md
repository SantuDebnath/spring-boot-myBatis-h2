# spring-boot-myBatis-h2-hateoas
A sample project using Spring-boot, Mybatis and H2 database

This is a simple employee management portal, where someone can execute basic CRUD operations on employee.
This project have rest end points for add, update, delete, get by empId and getAll functionality.

# Technical Stack description

Spring Boot : Spring Boot is a brand new framework from the team at Pivotal, designed to simplify the bootstrapping and development of a new Spring application. The framework takes an opinionated approach to configuration, freeing developers from the need to define boilerplate configuration

MyBatis: MyBatis is a Java persistence framework that couples objects with stored procedures or SQL statements using an XML descriptor or annotations.
MyBatis is light weight and fast compared to Hibernate/JPA. Here you dont need to learn HQL or JPQL. You can do anything with mysql.

H2 : H2 is a relational database management system written in Java. It can be embedded in Java applications or run in the client-server mode

HATEOAS : The Hypermedia Constraint (formerly known as HATEOAS) is a constraint that is used to provide direction to the user-agent.

By including links in returned representations, the server can remove the burden from the user-agent of determining what actions can be taken based on the current application state and knowing who to interact with in-order to achieve that goal.

# You can access H2 console from below ling with the given credentials..

http://localhost:8080/h2/login.jsp?jsessionid=b368e6178c785028d4c15a4a9a46c7d1

Driver Class:org.h2.Driver
JDBC URL:jdbc:h2:~/test
User Name : san
Password :


# You can simlpy run this application and interact with it using Postman

Method                  url                           request body

GET             localhost:8080/employee/getAllEmp         N/A

POST            localhost:8080/employee/createEmp         {
                                                            "name": "Srinibas",
                                                            "deptCode": "DBA",
                                                            "passportNo": "E123876"

                                                            }
                                                            
                                                            
POST            localhost:8080/employee/updateEmp         {
                                                            "name": "Haneef_seikh",
                                                            "empId": 1001,
                                                            "deptCode": "ADM",
                                                            "passportNo": "E1234567"
                                                          }                                                            
                                                            
PUT           localhost:8080/employee/delEmp/1002         N/A


GET           localhost:8080/employee/getEmp/1003          N/A

GET           http://localhost:8080/employee/dept/ADM     {
                                                              "deptCode": "ADM",
                                                              "deptName": "Application Development",
                                                              "employees": [
                                                                  {
                                                                      "name": "Haneef",
                                                                      "empId": 1001,
                                                                      "deptCode": "ADM",
                                                                      "passportNo": "E1234567",
                                                                      "links": []
                                                                  },
                                                                  {
                                                                      "name": "sandeep",
                                                                      "empId": 1002,
                                                                      "deptCode": "ADM",
                                                                      "passportNo": "E1234987",
                                                                      "links": []
                                                                  }
                                                              ]
                                                          }

