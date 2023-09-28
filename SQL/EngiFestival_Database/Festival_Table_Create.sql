create database EngiFestival;
use EngiFestival;
create table Festival
(
fest_id char(10),
fest_name char(10),
fest_participant_stud varchar(25),
stud_id char(6),
constraint college_fest foreign key (stud_id) references Student (stud_id) 
)

select * from Festival


select * from Student
insert into Festival values('2023_1','Robotics','Prince','1001') 
insert into Festival values('2023_2','Workshop','Paul','1003') 
insert into Festival values('2023_3','Datacon','Riya','1004') 




select * from Festival

show database CollegeFestival
SELECT name FROM sys. databases ;
SHOW DATABASES;
use CollegeFestival;
select * from Festival
insert into Festival values('2023_4','Codexcite','Riya','1004')
insert into Festival values('2023_5','Games','Paul','1003')


select *from student
insert into student values('1005','kiya','Delhi','K.K colony','8390540152') 
insert into student values('1006','Ranveer','Amravati','Philipin Area','9545063187') 
insert into student values('1007','Sohal','Mumbai','Rajapeth Square','8202662347') 
insert into student values('1008','Priya','Hyedrabad',' Rajkamal Square','7875013528')


select * from Festival
insert into Festival values('2023_6','DJ','ketty','1005')
insert into Festival values('2023_7','Present','Panchi','1004')
insert into Festival values('2023_8','Puzzeld','Samar','1005')
insert into Festival values('2023_9','Battle','Pratap','1006')
insert into Festival values('2023_10','Question','Ashok','1007')


update student set city_name='Hyedrabad'  where city_name='Chennai' ; 
update student set city_name='Ahemdabad'  where city_name='Delhi' ; 
