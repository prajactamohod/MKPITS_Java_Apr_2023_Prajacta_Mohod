-- (19) Retrieve the film titles rented by the customer with customer_id 500.

   use sakila 
   show tables
    select* from customer
	select* from rental 
	select*from inventory 
    select* from film
 select title from film left join inventory on inventory.film_id=film.film_id
 join rental on rental.inventory_id=inventory.inventory_id join customer on  
 customer.customer_id=rental.customer_id where customer.customer_id=500