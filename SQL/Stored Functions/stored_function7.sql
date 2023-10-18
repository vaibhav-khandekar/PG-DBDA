DELIMITER //
create function get_employee_experience(emp_id int)
returns varchar(1000)
deterministic
begin
	declare yoe varchar(1000);
    select group_concat(concat(datediff(end_date,start_date)/365)separator',')
    into yoe
    from job_history j
    join employees e
    on e.employee_id = j.employee_id
    where e.employee_id=emp_id;
    
    if yoe is null then
		return concat(emp_id,' does not exist');
	else
		return concat(emp_id,' has ',yoe,' years of experience ');
	end if;
end;
DELIMITER

select get_employee_experience(102);

select * from job_history;