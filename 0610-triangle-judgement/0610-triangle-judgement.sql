# Write your MySQL query statement below
select *,if(x<(y+z) and y<(x+z) and z<(x+y),'Yes','No') as triangle
from triangle;