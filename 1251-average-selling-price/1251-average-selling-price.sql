# Write your MySQL query statement below
select p.product_id,
round(
    sum(
        case 
            when u.purchase_date >= p.start_date 
             and u.purchase_date <= p.end_date
            then (u.units * p.price)
        end
    ) * 1.0 /sum(
        case 
            when u.purchase_date between p.start_date and p.end_date
            then u.units
        end
    ),
2) as average_price
from Prices as p 
left join
UnitsSold as u
on p.product_id=u.product_id 
group by p.product_id
order by p.product_id ASC;
