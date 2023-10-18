-- retrieve department_name with highest avg salary

-- query
select d.department_name from employees e , departments d
where e.department_id = d.department_id group by department_name
order by avg(e.salary) desc limit 1;

-- stored function 
DELIMITER //
create function get_high_avgsal_dept()
returns varchar(20)
deterministic
begin
	declare d_name varchar(20);
    select d.department_name into d_name from employees e , departments d
	where e.department_id = d.department_id group by department_name
	order by avg(e.salary) desc limit 1;
    return d_name;
end;

DELIMITER

select get_high_avgsal_dept();