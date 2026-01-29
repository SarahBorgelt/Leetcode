-- Write your PostgreSQL query statement below

-- Select only the product_id and product_name from the product table. Join the sales table to the product table on the product id. Group by the product_id, then use "having" to only select the rows with a sales date in the first quarter
SELECT Product.product_id, Product.product_name
FROM Product
JOIN Sales ON Sales.product_id = Product.product_id
GROUP BY Product.product_id, Product.product_name
HAVING MIN(Sales.sale_date) >= '2019-01-01'
AND MAX(Sales.sale_date) <= '2019-03-31';
