# Write your MySQL query statement below
select (select distinct salary from employee order by salary desc limit 1 offset 1) as SecondHighestSalary;
# select max(salary) as SecondHighestSalary from employee where salary < (select max(salary) from employee);