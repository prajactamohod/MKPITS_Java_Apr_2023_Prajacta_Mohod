create database EngiFestival;
use EngiFestival;
create table Student
(
stud_id char(6) primary key,
stud_name char(6),
city_name char(15),
address varchar(25),
mobileno varchar(10)
)
select *from student
insert into student values('1001','Prince','Amravati','Professor colony','8202662347') 
insert into student values('1003','Paul','Amravati','Professor colony','0987654321') 
insert into student values('1004','Riya','Chennai','Forest colony','1234567890') 