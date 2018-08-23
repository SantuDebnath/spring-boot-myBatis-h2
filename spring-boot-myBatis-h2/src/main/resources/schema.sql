DROP table employee;
create table employee
(
   name varchar(255) not null,
   emp_Id integer not null AUTO_INCREMENT,
   deptCode varchar(255) not null,
   passport_No varchar(255) not null,
   
   primary key(emp_Id)
);