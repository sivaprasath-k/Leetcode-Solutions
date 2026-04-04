# Write your MySQL query statement below
select p.product_id,
round(ifnull(sum(u.units*p.price),0)*1.0/ifnull(sum(u.units),1),2) as average_price
from Prices as p 
left join
UnitsSold as u
on p.product_id=u.product_id and
u.purchase_date between p.start_date and p.end_date
group by p.product_id
order by p.product_id ASC;
