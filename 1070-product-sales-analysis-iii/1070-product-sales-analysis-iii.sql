select s1.product_id,s1.year as first_year,s1.quantity,s1.price
from Sales as s1
join(
    select product_id,min(year) as fyear
    from Sales
    group by product_id
) as s2
on s1.product_id=s2.product_id and s1.year=s2.fyear;