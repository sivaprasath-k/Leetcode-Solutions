select a.name
from Employee a
join Employee b
on a.id=b.managerId
group by a.id
having count(b.managerId)>4;
