select a1.category,count(a2.account_id) as accounts_count
from(
    select "Low Salary" as category
    union
    select "Average Salary"
    union
    select "High Salary"
) as a1
left join(
    select account_id,
    case
       when income<20000 then "Low Salary"
       when income>=20000 and income<=50000 then "Average Salary"
       else "High Salary"
    end as categories
    from Accounts
) as a2
on a1.category=a2.categories
group by a1.category;