# Write your MySQL query statement below
SELECT
    weather.id AS 'Id'
FROM
    weather
        JOIN
    weather w ON weather.recordDate= DATE_ADD(w.recordDate, INTERVAL 1 DAY)
        AND weather.Temperature > w.Temperature
;

