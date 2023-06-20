# Write your MySQL query statement below
SELECT B.unique_id,A.NAME
FROM Employees AS A 
LEFT JOIN EmployeeUNI AS B 
ON A.ID=B.ID 