-- Write your PostgreSQL query statement below

-- Select the maximum number and label the columnn num.
SELECT MAX(num) AS num

-- Use a subquery to select only where the count is equal to one. We must use a grouping function (GROUP BY) because COUNT is an aggregate function that cannot be applied to individual rows without grouping.
FROM (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) = 1
) countsubquery;
