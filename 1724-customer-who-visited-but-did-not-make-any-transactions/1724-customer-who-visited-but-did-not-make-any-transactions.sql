# Write your MySQL query statement below
SELECT customer_id,COUNT(A.visit_id) AS count_no_trans
FROM VISITS AS A 
LEFT JOIN Transactions AS B 
ON A.visit_id=B.visit_id
WHERE B.transaction_id IS NULL
GROUP BY A.customer_id
