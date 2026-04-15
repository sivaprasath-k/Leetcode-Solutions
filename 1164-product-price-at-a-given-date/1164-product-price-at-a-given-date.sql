select p1.product_id,ifnull(p2.new_price,10) as price 
from Products as p1
left join(
    select product_id,new_price,change_date
    from Products
    where change_date<="2019-08-16"
) as p2
join(
    select product_id,max(change_date) as dat
    from Products
    where change_date<="2019-08-16"
    group by product_id
) as p3
on (p3.product_id=p2.product_id and p3.dat=p2.change_date)
on (p2.product_id=p1.product_id)
group by p1.product_id;