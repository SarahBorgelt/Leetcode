-- Write your PostgreSQL query statement below

-- Show the name, population, and area from the world table where area is greater than or equal to 3000000 OR population is greater than or equal to 25000000.
SELECT name, population, area
FROM world
WHERE area >=3000000 OR population>=25000000;
