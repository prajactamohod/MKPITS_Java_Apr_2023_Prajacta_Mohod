create database CollegeFestivalEvent;
use CollegeFestivalEvent;
create table Student
(
stud_id char(6) primary key,
stud_name char(6),
city_name char(15),
address varchar(25),
mobileno varchar(10)
)

select *from Student