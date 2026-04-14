-- select num as ConsecutiveNums
-- from Logs as l
-- where l.num in(l.id) and
--       l.num in(l.id+1) and
--       l.num in(l.id+2);
select distinct l1.num as ConsecutiveNums
from Logs as l1
join Logs as l2
join Logs as l3
on l1.id=l2.id+1 and
l1.id=l3.id+2
where l1.num=l2.num
and l1.num=l3.num;