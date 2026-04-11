select round(count(s.player_id)*1.0/count(distinct f.player_id),2) as fraction
from Activity as f
left join
(select player_id,min(event_date)+INTERVAL 1 DAY as slogin from Activity
                 GROUP BY player_id) as s
on f.player_id=s.player_id
and f.event_date=s.slogin;
