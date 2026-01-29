-- Write your PostgreSQL query statement below

-- Select only the product_name, year, and price from the sales table while joining the product table to the sales table to access the product name
SELECT product_name, year, price
FROM Sales
JOIN Product on Product.product_id = Sales.product_id;