 -- (21) List the film titles and rental dates for all rentals made by customer 
 -- "Steven Taylor".
 use sakila
 show tables
    select* from customer
	select* from rental 
	select*from inventory 
    select* from film
    
 select title,rental_date from film join inventory on
 inventory.film_id=film.film_id join rental on 
 rental.inventory_id=inventory.inventory_id join customer on
 customer.customer_id=rental.customer_id where first_name='Steven' and last_name='Taylor'
 
  