# Write your MySQL query statement below
-- select cid as customer_number from (select customer_number as cid, count(customer_number) as count 
-- from orders 
-- group by customer_number) r order by r.count desc limit 1;

SELECT customer_number
FROM orders
GROUP BY customer_number
ORDER BY COUNT(*) DESC
LIMIT 1;

