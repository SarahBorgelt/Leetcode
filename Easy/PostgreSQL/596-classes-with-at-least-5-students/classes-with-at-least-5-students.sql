-- Write your PostgreSQL query statement below

-- As per the README.md, only select classes from the Courses table. Group the table by classes and only display classes that have a count greater than or equal to 5. 
SELECT class 
FROM Courses
GROUP BY class
HAVING COUNT(class) >= 5;
