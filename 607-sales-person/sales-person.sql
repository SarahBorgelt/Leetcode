-- Write your PostgreSQL query statement below

-- Select the name from the SalesPerson table where it does not exist on orders and the company name is RED
SELECT SalesPerson.name
FROM SalesPerson 
WHERE NOT EXISTS(
    SELECT NULL
    FROM Orders
    JOIN Company ON Company.com_id = Orders.com_id
    WHERE Orders.sales_id = SalesPerson.sales_id
        AND Company.name = 'RED'
)