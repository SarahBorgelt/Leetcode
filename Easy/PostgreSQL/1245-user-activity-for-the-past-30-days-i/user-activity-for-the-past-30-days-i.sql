-- Write your PostgreSQL query statement below

--Select the activity_date and rename it day. Then use the distinct keyword to only count distinct user_ids and rename them active users.
SELECT activity_date AS day, COUNT(DISTINCT user_id) AS active_users
FROM Activity
--We must use WHERE because we want to filter rows before counting them. HAVING is for filtering after aggregation. We will limit results to only those with an activity date within the 30 days before 2019-07-27 as per the README.md. In this case, we will want to group by activity_date as the most logical choice. 
WHERE activity_date BETWEEN '2019-06-28' AND '2019-07-27'
GROUP BY activity_date
