# Write your MySQL query statement below
SELECT B.product_name,A.YEAR,A.PRICE
FROM SALES AS A
JOIN PRODUCT AS B 
ON A.product_id=B.product_id
