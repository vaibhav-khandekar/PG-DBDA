-- list of employees whose salary is >= the given salary

-- here we want to fetch multiple rows hence we use group_concat 
-- and use a separator to separate the values

DELIMITER //
create function get_emplist(sal int)
returns varchar(1000)
deterministic
begin
	declare ename varchar(1000);
    select group_concat(concat(first_name,' ',last_name)separator',') into ename from employees where salary >= sal;
    return ename;
end;
DELIMITER

select get_emplist(10000);
