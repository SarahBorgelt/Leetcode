-- Write your PostgreSQL query statement below

--Delete from the Person table when the id is not in the mininmum id from the person when grouped by email
DELETE FROM Person
WHERE id NOT IN(
    --Min selects the smallest ID, which we want to keep
    SELECT MIN(id)
    FROM Person
    --Group by enables all duplicates to be together
    GROUP BY email
);


