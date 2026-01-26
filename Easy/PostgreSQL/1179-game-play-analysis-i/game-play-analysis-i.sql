-- Write your PostgreSQL query statement below

-- Return the player_id and the minimum event date labeled as first login from the activity table. Sort the table by player_id.
SELECT player_id, MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;
