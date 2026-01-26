-- Write your PostgreSQL query statement below

--Rename the employee name portion as employee from the employee table
SELECT Employee.name AS Employee
FROM Employee

--Rename table manager and join it to the "Employee" table on the managerId field
JOIN Employee AS Manager ON Employee.managerId = Manager.id

--Return results where employee salary is greater than manager salary
WHERE Employee.salary > Manager.salary