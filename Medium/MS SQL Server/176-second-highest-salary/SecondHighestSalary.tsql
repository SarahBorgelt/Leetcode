/* Write your T-SQL query statement below */
/*Select max salary and alias it as second highest salary from the employee table. Use a subquery in the where clause to select only 
the top two salaries from the query, thus ensuring that the salary is lower than the second highest using the less than clause.*/ 
SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < (SELECT TOP 2 MAX(salary) FROM Employee)
