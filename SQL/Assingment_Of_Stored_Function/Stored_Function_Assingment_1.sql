delimiter //
CREATE FUNCTION total_order_value(order_quantity DECIMAL(10,2), unit_price DECIMAL(10,2))
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
  DECLARE total_order_value DECIMAL(10,2);
  SET total_order_value = order_quantity * unit_price;
  RETURN total_order_value;
END

// DELIMITER ;


SELECT order_id, total_order_value(order_quantity, unit_price) AS total_order_value
FROM orders;