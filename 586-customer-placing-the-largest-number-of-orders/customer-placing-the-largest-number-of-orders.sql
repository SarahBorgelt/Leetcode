-- Write your PostgreSQL query statement below

-- Return the customer number from the orders table
SELECT Orders.customer_number
FROM Orders 

-- Group the data by customer number
GROUP BY customer_number

-- Order by the count of orders in descending order and only return 1 result to show the customer number with the highest orders
ORDER BY COUNT(order_number) DESC
LIMIT 1;