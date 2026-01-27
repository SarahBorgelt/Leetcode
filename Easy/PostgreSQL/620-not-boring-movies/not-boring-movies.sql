-- Write your PostgreSQL query statement below

-- Select the necessary fields from the Cinema table and return rows only where the id divided by 2 does not leave a remainder of 0 (i.e., only show uneven ids) and the description is not boring. Order by the rating in descending order.
SELECT id, movie, description, rating
FROM Cinema
WHERE id % 2 != 0 AND description != 'boring'
ORDER BY rating DESC;
