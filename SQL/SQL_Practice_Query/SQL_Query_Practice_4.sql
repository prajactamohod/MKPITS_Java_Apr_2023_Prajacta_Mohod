-- (4) Display the first name, last name, and email of customers who have rented the film titled "Spice Sorcerer".
use sakila
show tables
   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
  select first_name,last_name from customer join rental on customer.customer_id=rental.customer_id 
  join inventory on inventory.inventory_id=rental.inventory_id
  join film on film.film_id=inventory.film_id 
  where title="Spice Sorcerer"
 