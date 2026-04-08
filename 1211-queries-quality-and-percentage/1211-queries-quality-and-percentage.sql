# Write your MySQL query statement below
select query_name,
round(sum(rating*1.0/position)/count(*),2) as quality,
ifnull(round((sum(case
           when rating<3
           then 1
          end  )*1.0/count(*))*100,2),0) as poor_query_percentage
from Queries
group by query_name;