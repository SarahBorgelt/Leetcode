-- Write your PostgreSQL query statement below

-- Show the customer name from the customer table where the referree_id is not 2 or is null
SELECT Customer.name 
FROM Customer
WHERE referee_id != 2 OR referee_id IS NULL;
