-- find sal of employee whose first_name , last_name matches the given parameter

DELIMITER //
create function get_sal_fnln(fname varchar(10),lname varchar(10))
returns int
deterministic
begin
	declare sal int;
    select salary into sal from employees
    where first_name=fname and last_name=lname;
    return sal;
end;
DELIMITER

select get_sal_fnln('Neena','Kochhar');