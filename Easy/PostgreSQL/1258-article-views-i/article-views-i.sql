-- Write your PostgreSQL query statement below

-- Select only distinct author ids and rename id from the Views table only where the author_id equals the viewer_id
SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id = viewer_id
