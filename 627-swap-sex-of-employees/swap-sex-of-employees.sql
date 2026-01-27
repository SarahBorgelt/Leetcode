-- Write your PostgreSQL query statement below

-- Update the salary table
UPDATE Salary

-- Turn the values of sex to the case presented below
SET sex = CASE
        WHEN sex = 'm' THEN 'f'
        WHEN sex = 'f' THEN 'm'
END;