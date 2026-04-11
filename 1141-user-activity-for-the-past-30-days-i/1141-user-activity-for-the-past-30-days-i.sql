select a1.activity_date as day,count(distinct a1.user_id) as active_users
from Activity as a1
join (
    select user_id,activity_date
    from Activity
    where activity_date between "2019-06-28" and "2019-07-27"
) as a2
on a1.user_id=a2.user_id
and a1.activity_date=a2.activity_date
group by a1.activity_date;