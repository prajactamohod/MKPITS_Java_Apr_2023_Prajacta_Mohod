-- (1) Retrieve the names of all customers and the titles of the films they have rented.
use sakila
show tables
select* from customer
select* from rental
select* from inventory
select* from film
select first_name,last_name,title from customer join rental on 
customer.customer_id=rental.customer_id join inventory on 
inventory.inventory_id=rental.inventory_id join film on film.film_id=inventory.film_id 