# Write your MySQL query statement below
select e.name as name,b.bonus as bonus 
from employee e
left join bonus b on b.empId = e.empId
where b.bonus is null or b.bonus<1000;