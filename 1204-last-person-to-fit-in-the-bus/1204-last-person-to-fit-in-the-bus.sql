-- select q1.turn,sum(q1.weight) over(order by q1.turn) as total
-- from Queue as q1
-- join(

-- ) q2
-- on q1.person_id=q2.person_id;
select q1.person_name
from Queue q1
join(
    select turn,sum(weight) over(order by turn) total
    from queue
) q2
join(
    select turn,sum(weight) over(order by turn) total
    from queue
) q3
on (q2.turn=q3.turn and q2.total<=1000)
on (q2.turn=q1.turn)
order by q1.turn desc
limit 1;
