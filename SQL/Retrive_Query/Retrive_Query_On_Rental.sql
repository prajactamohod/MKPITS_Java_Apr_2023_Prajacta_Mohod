--  Retrieve the most recent rentals--
select *from rental
select *from rental order by return_date desc

 -- Retrieve the distinct film categories available
select *from film_category
select distinct (category_id) from film_category

--  Retrieve the rental history for a specific customer
select *from rental 
select *from rental where customer_id =3
