create database Marketing_Department;
use Marketing_Department;
drop table Product
create table Product
(
product_id varchar(6) primary key,
product_name varchar(20),
price_of_product varchar(20),
quantity varchar(15)
)

select *from Product;




insert into  Product values('1001','Laptops','30,000_for_each','20'); 
insert into  Product values('1002','Laptops_Bags','1000_for_each','20'); 
insert into  Product values('1003','Lenovo_Mobiles','20,000_for_each','20'); 
insert into  Product values('1004','Vivo_Mobies','15,000_for_each','25'); 
insert into  Product values('1005','OnePlus_Mobile','30,000_for_each','10') ;
insert into  Product values('1006','Smart_Watch','5000_for_each','20'); 
insert into  Product values('1007','Headphones','3000_for_each','20') ;
drop table sale
create table Sale
(
product_name char(20),
price varchar(12),
product_id varchar(20),
quantity varchar (15)

)

drop table sale
insert into Sale values('Laptops','1000','1001','20') ;

drop TRIGGER after_sale_trigger
delimiter //
create TRIGGER after_sale_trigger AFTER INSERT ON Sale
for each row
begin
-- Update the product stock after a sale
UPDATE Product
SET quantity = quantity - NEW.Quantity
WHERE  product_id=NEW.product_id;
end;
//
delimiter ;

select * from Product

