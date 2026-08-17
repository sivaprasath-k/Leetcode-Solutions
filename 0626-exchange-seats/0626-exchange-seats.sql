select s1.id,ifnull(
    case
       when s1.id%2 in("0") then s3.student
       else s2.student
    end,s1.student) as student
from(
    select id,student
    from Seat
) s1
left join(
    select id,student
    from Seat
) as s2
on (s1.id+1=s2.id)
left join(
    select id,student
    from Seat
) as s3
on (s1.id=s3.id+1);