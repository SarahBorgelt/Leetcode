-- Write your PostgreSQL query statement below

-- This leetcode problem was an excellent learning experience for me. I learned that I needed to cast numbers to ::numeric to avoid integer math (turns out, integer math isn't just in Java!). This is likely the most complex PostgresSQL query I've written as of 2/10/26. It was a great way to learn more and begin building more complex queries, such as combining multiple functions into one to get the desired result.  
SELECT query_name, ROUND(AVG(rating::numeric/position),2) AS quality, ROUND((COUNT(*) FILTER (WHERE rating < 3)::numeric)/COUNT(*) * 100,2) AS poor_query_percentage
FROM Queries
GROUP BY query_name;
