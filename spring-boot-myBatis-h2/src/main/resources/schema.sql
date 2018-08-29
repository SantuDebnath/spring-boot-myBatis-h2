DROP table department;
create table department
(
  deptCode varchar(255) not null,
  deptNAme varchar(255) not null,
  primary key(deptCode)
  
);

DROP table employee;
create table employee
(
   name varchar(255) not null,
   emp_Id integer not null AUTO_INCREMENT,
   deptCode varchar(255) not null,
   passport_No varchar(255) not null, 
   PRIMARY KEY(emp_Id ),
   FOREIGN KEY(deptCode)
   REFERENCES department(deptCode)
);

