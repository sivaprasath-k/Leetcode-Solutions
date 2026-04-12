select c1.class
from Courses as c1
join(
    select class,count(student) as n
    from Courses
    group by class
    having n>=5
) as c2
on c1.class=c2.class
group by c1.class;