select a.machine_id,
ROUND(AVG(b.timestamp-a.timestamp),3) as processing_time
FROM Activity a join Activity b
ON a.machine_id=b.machine_id
AND a.process_id=b.process_id
where b.activity_type="end"
AND a.activity_type="start"
group by machine_id;