--(9) Display the first name, last name, and email of customers who have rented the film titled "Flight Lies".
 use sakila 
 show tables
 
 select* from customer
 select * from rental     
 select*from inventory 
 select*from film  
 
 select first_name,last_name,email from customer join rental on
 rental.customer_id=customer.customer_id join inventory on 
 inventory.inventory_id=rental.inventory_id join film on
 film.film_id=inventory.film_id where title="Flight Lies"