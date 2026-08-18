select distinct c1.visited_on+Interval 6 day as visited_on,
sum(c2.amount) amount,round(sum(c2.amount)/7,2) average_amount
from Customer c1
left join(
    select visited_on,amount
    from Customer
) c2
on c2.visited_on>=c1.visited_on
and c2.visited_on<=c1.visited_on+interval 6 day
group by c1.visited_on,c1.name
having count(distinct c2.visited_on)>6
order by c1.visited_on asc;