select s.user_id,
coalesce(round(sum(case
when c.action="confirmed"
then 1
else 0 end)*1.0/count(c.user_id),2),0) AS confirmation_rate
from Signups as s
left join Confirmations as c
on s.user_id=c.user_id
group by s.user_id;