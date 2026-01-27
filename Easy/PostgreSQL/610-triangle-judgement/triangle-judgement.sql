-- Write your PostgreSQL query statement below

-- Only select columns x,y, and z. 
SELECT x, y, z,

-- We use CASE as a version of IF/THEN/ELSE. If all of the criteria is true, return yes. Otherwise, return no. We use END to end the case and AS to rename the column as triangle. 
    CASE 
        WHEN x + y > z
            AND x + z > y
            AND y + z > x
        THEN 'Yes'
        ELSE 'No'
    END AS triangle
FROM Triangle;


