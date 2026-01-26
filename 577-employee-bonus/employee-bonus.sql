-- Write your PostgreSQL query statement below

-- Return the employee name and bonus from the employee and bonus table
SELECT Employee.name, Bonus.bonus
FROM Employee

-- Join the Bonus table on the empId field. Use a left join to ensure that all employees are included whereas only employees that meet the criteria are selected on the right.
LEFT JOIN Bonus ON Bonus.empId = Employee.empId

-- Filter to where the bonus is less than $1000 or is null
WHERE Bonus.bonus < 1000 OR Bonus.bonus IS NULL;