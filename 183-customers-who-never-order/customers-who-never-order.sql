-- Write your PostgreSQL query statement below

--Rename the name column to Customers to match the header that leetcode is expecting
SELECT Customers.name AS Customers
FROM Customers

--Use a left join to match *all* customers and orders only where there is a match
LEFT JOIN Orders ON Orders.customerId = Customers.id

--Only pull in orders where the customer has not ordered
WHERE orders.id IS null;