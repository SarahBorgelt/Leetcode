-- Write your PostgreSQL query statement below

-- Only return the ids as Id to match the README instructions
SELECT today.id AS Id

-- Name the weather table today
FROM Weather today

-- Name the second weather table yesterday and join it to today using the record date + 1 day
JOIN Weather yesterday
    ON today.recordDate = yesterday.recordDate + INTERVAL '1 day'

-- Only select ids where today's temperature is greater than yesterday's temperature
WHERE today.temperature > yesterday.temperature