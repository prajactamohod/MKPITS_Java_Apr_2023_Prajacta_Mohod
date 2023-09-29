    -- retrive_data_from_sakila_database--
    
use sakila
show tables

-- Retrieve all customer names and their email addresses--
select *from Customer
select First_name , email from customer

--  Retrieve the number of distinct films in the inventory
select * from inventory
select distinct (film_id) from inventory

 -- Retrieve the rental details for a specific rental ID--
select * from rental
select *from rental where rental_id = 7

-- Retrieve all film titles and their lengths (in minutes)--
select *from film 

-- Retrieve the staff details for a specific staff ID--
select *from staff
select *from staff where staff_id = 2

-- Retrieve the customers from a specific city--
select *from customer_list


--  Retrieve the most recent rentals--
select *from rental
select *from rental order by return_date desc

 -- Retrieve the distinct film categories available
select *from film_category
select distinct (category_id) from film_category

--  Retrieve the rental history for a specific customer
select *from rental 
select *from rental where customer_id =3




