-- # Write your MySQL query statement below
-- select round(sum(case
--                  when d1.order_date=d1.customer_pref_delivery_date
--                  and d1.order_date<d2.order_date
--                  and d1.customer_id=d2.customer_id
--                  then 1
--                 end)*100*1.0/count(distinct d1.customer_id),2) as immediate_percentage
-- from Delivery as d1
-- join Delivery as d2
-- on d1.customer_id=d2.customer_id;
select round(sum(case when d1.order_date=d1.customer_pref_delivery_date
                then 1
                end)*1.0*100/count(*),2) as immediate_percentage
from Delivery as d1
join (select customer_id,min(order_date) as firstdate
      from Delivery
      group by customer_id
)as d2
on d1.customer_id=d2.customer_id
and d1.order_date=d2.firstdate;
