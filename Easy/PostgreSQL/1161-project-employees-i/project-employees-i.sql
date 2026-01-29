-- Write your PostgreSQL query statement below

-- Select only the project id and round the average years of experience to 2 decimal places as per the README. The average years of experience will be renamed average years. Then we will need to join the employee table using employee_id. This will enable access to the years of experience. Lastly, we will order by and group by project_id to ensure that the data combines rows and orders by project_id
SELECT project_id, ROUND(AVG(experience_years),2) AS average_years
FROM Project
JOIN Employee ON Employee.employee_id = Project.employee_id
GROUP BY project_id
ORDER BY project_id ASC;
