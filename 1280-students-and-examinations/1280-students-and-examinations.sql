select a.student_id,a.student_name,s.subject_name,count(b.subject_name) as attended_exams
from Students as a 
cross join Subjects s
left join Examinations as b
ON a.student_id=b.student_id
AND s.subject_name=b.subject_name
group by a.student_id,a.student_name,s.subject_name
order by a.student_id,a.student_name asc;
