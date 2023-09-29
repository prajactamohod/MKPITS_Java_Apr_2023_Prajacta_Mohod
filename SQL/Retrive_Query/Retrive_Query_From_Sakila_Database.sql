

use sakila;
CREATE TABLE Student (
    stud_id CHAR(6) PRIMARY KEY,
    stud_name CHAR(6),
    city_name CHAR(15),
    address VARCHAR(25),
    mobileno VARCHAR(10)
)

create table Festival
(
fest_id char(10),
fest_name char(10),
fest_participant_stud varchar(25),
stud_id char(6),
constraint college_fest foreign key (stud_id) references Student (stud_id) 
)

               --Retrive data from sakila database--
use sakila
show tables