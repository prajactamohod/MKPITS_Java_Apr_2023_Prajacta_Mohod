 -- (38) Display the film titles rented by the customer with customer_id 1000.
 use sakila
 show tables
select*from film
select* from inventory
select*from rental
select* from customer

select title from film join inventory  
 on inventory.film_id= film.film_id join rental
 on  rental.inventory_id=inventory.inventory_id join customer
 on customer.customer_id=rental.customer_id where customer.customer_id=1000