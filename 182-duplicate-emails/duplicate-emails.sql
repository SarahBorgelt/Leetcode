-- Write your PostgreSQL query statement below

--SELECT all emails in the Person table and group by email only if there is a count greater than one
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(*)>1;

