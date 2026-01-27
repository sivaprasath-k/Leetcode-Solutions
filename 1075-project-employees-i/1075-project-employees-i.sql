# Write your MySQL query statement below
select project_id,ROUND(AVG(experience_years),2) AS average_years
FROM Project AS P
LEFT JOIN Employee AS E ON
P.employee_id=E.employee_id
GROUP BY project_id;
