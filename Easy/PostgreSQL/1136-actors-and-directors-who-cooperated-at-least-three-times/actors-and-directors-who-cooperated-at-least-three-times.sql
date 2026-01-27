-- Write your PostgreSQL query statement below

-- Select the actor_id and director_id fields from the ActorDirector table that have a count of greater than or equal to 3.
SELECT actor_id, director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*)>=3
